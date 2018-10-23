package development.downright.cucumberbeans.antlr.integration;

import javax.swing.event.ChangeListener;
import development.downright.cucumberbeans.antlr.GherkinLexer;
import development.downright.cucumberbeans.antlr.GherkinParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;
/**
 *
 * @author SessonaD
 */
public class IntegrationGherkinParser extends Parser {

    private Snapshot snapshot; //an instance of the most current feature file
    private GherkinParser gherkinParser; 
    
    @Override
    public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {
        this.snapshot = snpsht;
        
        //allocate the current feature file to an AntlrStringStream
        //then send it to the lexer/parser.
        ANTLRStringStream input = 
                new ANTLRStringStream(snapshot.getText().toString());
        
        Lexer lexer = new GherkinLexer(input); //TODO can I create a static lexer so it's only called once?
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gherkinParser = new GherkinParser(tokens);
        try {
            gherkinParser.feature();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Result getResult(Task task) throws ParseException {
        return new IntegrationGherkinParserResult(gherkinParser,snapshot);
    }

    @Override
    public void addChangeListener(ChangeListener cl) {}

    @Override
    public void removeChangeListener(ChangeListener cl) {}

}
