/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans.antlr.integration;

import java.util.ArrayList;
import java.util.List;
import development.downright.cucumberbeans.antlr.GherkinParser;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 *
 * @author SessonaD
 */
public class IntegrationGherkinParserResult extends ParserResult{
    
    private GherkinParser gherkingParser;
    private boolean valid = true;

    public IntegrationGherkinParserResult(GherkinParser gherkingParser, Snapshot _snapshot) {
        super(_snapshot);
        this.gherkingParser = gherkingParser;
    }
    
    public GherkinParser getGherkinParser() throws ParseException {
        if (!valid) {
            throw new ParseException();
        }
        return gherkingParser;
    }

    @Override
    protected void invalidate() {
         valid = false;
    }

    @Override
    public List<? extends Error> getDiagnostics() {
        return new ArrayList<Error>();
    }
}
