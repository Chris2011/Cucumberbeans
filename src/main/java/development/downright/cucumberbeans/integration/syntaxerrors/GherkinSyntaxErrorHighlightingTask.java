package development.downright.cucumberbeans.integration.syntaxerrors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.text.Document;
import javax.swing.text.Element;
import development.downright.cucumberbeans.antlr.SyntaxError;
import development.downright.cucumberbeans.antlr.integration.GherkinTokenId;
import development.downright.cucumberbeans.antlr.integration.IntegrationGherkingParserResult;
import development.downright.cucumberbeans.findimpl.CucumberImplData;
import development.downright.cucumberbeans.findimpl.CucumberImplElement;
import development.downright.cucumberbeans.integration.completion.GherkinCompletionNames;
import development.downright.cucumberbeans.integration.hints.DeleteLineFix;
import development.downright.cucumberbeans.integration.hints.ExpectingFeatureFix;
import development.downright.cucumberbeans.integration.hints.ExpectingScenarioFix;
import development.downright.cucumberbeans.integration.hints.ExpectingStepDescriptionFix;
import development.downright.cucumberbeans.integration.hints.ExpectingStepFix;
import development.downright.cucumberbeans.integration.hints.ExpectingTitleFix;
import development.downright.cucumberbeans.integration.hints.GotoStepImplHint;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.ParserResultTask;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.Fix;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;
import org.openide.util.Exceptions;

/**
 *
 * @author SessonaD
 */
public class GherkinSyntaxErrorHighlightingTask extends ParserResultTask {

    @Override
    public void run(Result r, SchedulerEvent se) {
        try {
            IntegrationGherkingParserResult gherkinRes = (IntegrationGherkingParserResult) r;
            List<SyntaxError> syntaxErrors = gherkinRes.getGherkinParser().syntaxErrors;
            Document document = r.getSnapshot().getSource().getDocument(false);
            List<ErrorDescription> errors = new ArrayList<>();

            //get token sequence to find out offset of token where the excetion was found
            TokenHierarchy<GherkinTokenId> th = (TokenHierarchy<GherkinTokenId>) r.getSnapshot().getTokenHierarchy();
            TokenSequence<GherkinTokenId> ts = th.tokenSequence(GherkinTokenId.getLanguage());
            for (SyntaxError syntaxError : syntaxErrors) {
                if (syntaxError.getLine() <= 0) {
                    continue;
                }
                //get offset and fixes where can apply
                int offset = getTokenExceptionOffset(ts, syntaxError);
                List<Fix> fixes = getFixesWherePossible(ts, document, syntaxError, offset);
                String description = syntaxError.getMessageToDispaly();
                ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, (description == null) ? "" : description, fixes, document, syntaxError.getLine());
                errors.add(errorDescription);
            }

            //add all hints
            for (ErrorDescription hint : addStepsHints(document, th, ts)) {
                errors.add(hint);
            }

            HintsController.setErrors(document, "feature", errors);
        } catch (ParseException ex1) {
            Exceptions.printStackTrace(ex1);
        }
    }

    public List<ErrorDescription> addStepsHints(Document document, TokenHierarchy<GherkinTokenId> th, TokenSequence<GherkinTokenId> ts) {
        List<ErrorDescription> errorDescs = new ArrayList<>();
        HashMap<Integer, String> steps = (HashMap<Integer, String>) getAllStepsTokens(document, th, ts);

        for (Entry<Integer, String> entry : steps.entrySet()) {
            String description = entry.getValue();
            List<Fix> fixes = getNavigationCodeFixes(description);
            Severity stepSeverity = Severity.HINT;
            String errorMessage = "Click on the hint to go to the implementation";
            if (fixes.isEmpty()) {
                stepSeverity = Severity.WARNING;
                errorMessage = "No implementations found for this step";
            } else if (fixes.size() > 1) {
                stepSeverity = Severity.ERROR;
                errorMessage = "More than one implementation found for this step, expecting only one.";
            }
            ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
                    stepSeverity,
                    errorMessage,
                    fixes, document, entry.getKey());
            errorDescs.add(errorDescription);
        }
        return errorDescs;
    }

    private List<Fix> getNavigationCodeFixes(String description) {
        List<Fix> fixes = new ArrayList<>();
        Set<CucumberImplElement> impls = CucumberImplData.getMatchingImpls(description);
        if (!impls.isEmpty()) {
            for (CucumberImplElement imp : impls) {
                fixes.add(new GotoStepImplHint(imp));
            }
        }
        return fixes;
    }

    private Map<Integer, String> getAllStepsTokens(Document document, TokenHierarchy<GherkinTokenId> th, TokenSequence<GherkinTokenId> ts) {
        Map<Integer, String> steps = new HashMap<>();
        ts.moveStart();
        int lineNumber = 1;
        StringBuilder sb;
        while (ts.moveNext()) {
            Token<GherkinTokenId> token = ts.token();
            if (token.id().primaryCategory().equals("Stepkeyword")) {
                lineNumber = getLineNumber(document, ts.offset());
                sb = new StringBuilder();
                while (ts.moveNext()) {
                    token = ts.token();
                    if (token.id().name().equals("NL")) {
                        break;
                    }
                    sb.append(token.text());
                }
                steps.put(lineNumber, sb.toString());
            }
        }
        return steps;
    }

    public static int getLineNumber(Document doc, int pos) {
        Element map = doc.getDefaultRootElement();
        int line = map.getElementIndex(pos);
        return line + 1;
    }

    private List<Fix> getFixesWherePossible(TokenSequence<GherkinTokenId> ts, Document document, SyntaxError error, int offset) {
        List<Fix> fixes = new ArrayList<>();
        if (null != error.getErrorType()) {
            switch (error.getErrorType()) {
                case NOT_VIABLE_BACKGROUND:
                    fixes.add(new ExpectingScenarioFix(document, offset, GherkinCompletionNames.BACKGROUND));
                    fixes.add(new ExpectingScenarioFix(document, offset, GherkinCompletionNames.SCENARIO));
                    fixes.add(new ExpectingScenarioFix(document, offset, GherkinCompletionNames.SCENOUT));
                    try {
                        int start = getStartOfLineOffset(ts, error);
                        int end = getEndOfLineOffset(ts, error);
                        fixes.add(new DeleteLineFix(document, start, end));
                    } catch (Exception e) {
                    }
                    break;
                case NOT_VIABLE_SCENARIO:
                    fixes.add(new ExpectingScenarioFix(document, offset, GherkinCompletionNames.SCENARIO));
                    fixes.add(new ExpectingScenarioFix(document, offset, GherkinCompletionNames.SCENOUT));
                    try {
                        int start = getStartOfLineOffset(ts, error);
                        int end = getEndOfLineOffset(ts, error);
                        fixes.add(new DeleteLineFix(document, start, end));
                    } catch (Exception e) {
                    }
                    break;
                case NOT_VIABLE_FEATURE:
                    try {
                        int start = getStartOfLineOffset(ts, error);
                        int end = getEndOfLineOffset(ts, error);
                        fixes.add(new DeleteLineFix(document, start, end));
                    } catch (Exception e) {
                    }
                    break;
                case MISMATCHED_FEATURE:
                    fixes.add(new ExpectingFeatureFix(document, offset));
                    try {
                        int start = getStartOfLineOffset(ts, error);
                        int end = getEndOfLineOffset(ts, error);
                        fixes.add(new DeleteLineFix(document, start, end));
                    } catch (Exception e) {
                    }
                    break;
                case MISSING_FEATURE:
                    fixes.add(new ExpectingFeatureFix(document, offset));
                    break;
                case MISSING_SCENARIO:
                    fixes.add(new ExpectingScenarioFix(document, offset, GherkinCompletionNames.SCENARIO));
                    fixes.add(new ExpectingScenarioFix(document, offset, GherkinCompletionNames.SCENOUT));
                    break;
                case MISSING_STEP:
                    fixes.add(new ExpectingStepFix(document, offset, GherkinCompletionNames.GIVEN));
                    fixes.add(new ExpectingStepFix(document, offset, GherkinCompletionNames.WHEN));
                    fixes.add(new ExpectingStepFix(document, offset, GherkinCompletionNames.THEN));
                    fixes.add(new ExpectingStepFix(document, offset, GherkinCompletionNames.AND));
                    fixes.add(new ExpectingStepFix(document, offset, GherkinCompletionNames.BUT));
                    break;
                case MISSING_TITLE:
                    fixes.add(new ExpectingTitleFix(document, offset));
                    break;
                case MISSING_STEP_DESC:
                    fixes.add(new ExpectingStepDescriptionFix(document, offset));
                    break;
                default:
                    break;
            }
        }

        return fixes;
    }

    private int getStartOfLineOffset(TokenSequence<GherkinTokenId> ts, SyntaxError error) throws Exception {
        int index = error.getIndex();

        ts.moveIndex(index);
        ts.moveNext();

        while (ts.movePrevious()) {
            Token<GherkinTokenId> token = ts.token();
            if (token.id().name().equals("NL")) {
                return ts.offset();
            }
        }

        throw new Exception();
    }

    private int getEndOfLineOffset(TokenSequence<GherkinTokenId> ts, SyntaxError error) throws Exception {
        int index = error.getIndex();
        ts.moveIndex(index);
        ts.moveNext();
        while (ts.moveNext()) {
            Token<GherkinTokenId> token = ts.token();
            if (token.id().name().equals("NL")) {
                return ts.offset();
            }
        }
        throw new Exception();
    }

    private int getTokenExceptionOffset(TokenSequence<GherkinTokenId> ts, SyntaxError error) {
        try {
            int index = error.getIndex();
            ts.moveIndex(index);
            ts.moveNext();
            return ts.offset();
        } catch (Exception e) {
            System.out.println("no more tokens");
            ts.movePrevious();
            return ts.offset();
        }
    }

    @Override
    public int getPriority() {
        return 100;
    }

    @Override
    public Class<? extends Scheduler> getSchedulerClass() {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

    @Override
    public void cancel() {
    }
}
