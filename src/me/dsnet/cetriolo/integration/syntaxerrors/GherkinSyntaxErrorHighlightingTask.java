/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.syntaxerrors;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import me.dsnet.cetriolo.antlr.integration.GherkinTokenId;
import me.dsnet.cetriolo.antlr.integration.IntegrationGherkingParserResult;
import me.dsnet.cetriolo.antlr.output.SyntaxError;
import me.dsnet.cetriolo.integration.hints.ExpectingFeatureFix;
import org.antlr.runtime.RecognitionException;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
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
public class GherkinSyntaxErrorHighlightingTask extends ParserResultTask{

    @Override
    public void run(Result r, SchedulerEvent se) {
        try {
            IntegrationGherkingParserResult gherkinRes = (IntegrationGherkingParserResult) r;
            List<SyntaxError> syntaxErrors = gherkinRes.getGherkinParser().syntaxErrors;
            Document document = r.getSnapshot().getSource().getDocument(false);              
            List<ErrorDescription> errors = new ArrayList<ErrorDescription>();
            
            //get token sequence to find out offset of token where the excetion was found
            TokenHierarchy<GherkinTokenId> th = (TokenHierarchy<GherkinTokenId>) r.getSnapshot().getTokenHierarchy();
            TokenSequence<GherkinTokenId> ts = th.tokenSequence(GherkinTokenId.getLanguage());
            for (SyntaxError syntaxError : syntaxErrors) {        
                printException(syntaxError); 
                if (syntaxError.getLine() <= 0) {
                    continue;
                }                
                //get offset and fixes where can apply
                int offset = getTokenExceptionOffset(ts,syntaxError);
                List<Fix> fixes = getFixesWherePossible(document,syntaxError, offset);
                ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(Severity.ERROR,syntaxError.getMessageToDispaly(),fixes,document,syntaxError.getLine());
                errors.add(errorDescription);
            }
            HintsController.setErrors(document, "feature", errors);               
        }catch (Exception ex1) {
            Exceptions.printStackTrace (ex1);
        }
    }
    
    private List<Fix> getFixesWherePossible(Document document,SyntaxError error,int offset){
        List<Fix> fixes = new ArrayList<Fix>();
        printException(error);
        if(error.getErrorType() == SyntaxError.ErrorType.MISSING_FEATURE){
            fixes.add(new ExpectingFeatureFix(document,offset));
        }else{
            printException(error);
        }        
        return fixes;
    }
    
    private void printException(SyntaxError error){
        RecognitionException ex=error.getException();
        System.out.println("---------------------------------------------------");
        System.out.println("\ngetLocalizedMessage: " + ex.getLocalizedMessage());
        System.out.println("\ngetMessage: " + ex.getMessage());
        System.out.println("\ngetCause: " + ex.getCause());
        System.out.println("\nerror message: " + error.getMessage());
    }
    
    private int getTokenExceptionOffset(TokenSequence<GherkinTokenId> ts, SyntaxError error) {
        try{
            int index = error.getIndex();
            ts.moveIndex(index);
            ts.moveNext();
            return ts.offset();
        }catch(Exception e){
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
    public void cancel() {}
    
}
