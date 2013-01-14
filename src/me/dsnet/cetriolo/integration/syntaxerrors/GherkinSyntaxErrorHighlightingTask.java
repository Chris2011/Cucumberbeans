/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.syntaxerrors;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import me.dsnet.cetriolo.antlr.integration.IntegrationGherkingParserResult;
import me.dsnet.cetriolo.antlr.output.GherkinParser.SyntaxError;
import org.antlr.runtime.RecognitionException;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.ParserResultTask;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;
import org.openide.util.Exceptions;

/**
 *
 * @author SessonaD
 */
public class GherkinSyntaxErrorHighlightingTask extends ParserResultTask{

    @Override
    public void run(Result r, SchedulerEvent se) {
        try {
            IntegrationGherkingParserResult gherkinRes = (IntegrationGherkingParserResult) r;
            List<SyntaxError> syntaxErrors = gherkinRes.getGherkinParser().syntaxErrors;
            Document document = r.getSnapshot().getSource().getDocument(false);
            List<ErrorDescription> errors = new ArrayList<ErrorDescription>();
            for (SyntaxError syntaxError : syntaxErrors) {
                RecognitionException exception = syntaxError.exception;
                String message = syntaxError.message;

                int line = exception.line;
                if (line <= 0) {
                    continue;
                }
                ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
                        Severity.ERROR,
                        message,
                        document,
                        line);
                errors.add(errorDescription);
            }
            HintsController.setErrors(document, "feature", errors);
            
           
        }catch (Exception ex1) {
            Exceptions.printStackTrace (ex1);
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
    public void cancel() {}
    
}
