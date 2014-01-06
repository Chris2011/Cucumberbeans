/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.antlr.integration;

import javax.swing.event.ChangeListener;
import me.dsnet.cetriolo.antlr.output.GherkinLexer;
import me.dsnet.cetriolo.antlr.output.GherkinParser;
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
public class IntegrationGherkinParser extends Parser{

    private Snapshot snapshot;
    private GherkinParser gherkinParser;
    
    @Override
    public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {
        this.snapshot = snpsht;
        ANTLRStringStream input = new ANTLRStringStream(snapshot.getText().toString());
        Lexer lexer = new GherkinLexer(input);
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
        return new IntegrationGherkingParserResult(gherkinParser,snapshot);
    }

    @Override
    public void addChangeListener(ChangeListener cl) {}

    @Override
    public void removeChangeListener(ChangeListener cl) {}

}
