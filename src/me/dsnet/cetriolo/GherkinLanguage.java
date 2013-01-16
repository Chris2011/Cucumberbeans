/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo;

import me.dsnet.cetriolo.antlr.integration.GherkinTokenId;
import me.dsnet.cetriolo.antlr.output.GherkinParser;
import me.dsnet.cetriolo.integration.fold.GherkinStructureScanner;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.parsing.spi.Parser;
/**
 *
 * @author SessonaD
 */

public class GherkinLanguage extends DefaultLanguageConfig{
    
    private static final String LINE_COMMENT_PREFIX = "# ";
    
    @Override
    public Language getLexerLanguage() {
        return GherkinTokenId.getLanguage();
    } 

    @Override
    public String getDisplayName() {
        return "Cucumber";
    }
    
    @Override
    public String getLineCommentPrefix() {
        return LINE_COMMENT_PREFIX;
    }

    @Override
    public String getPreferredExtension() {
        return "feature";
    }
    
    @Override
    public boolean hasStructureScanner() {
        return true;
    }

    @Override
    public StructureScanner getStructureScanner() {
        return new GherkinStructureScanner();
    }

}
