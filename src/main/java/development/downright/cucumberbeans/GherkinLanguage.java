/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans;

import development.downright.cucumberbeans.antlr.integration.GherkinTokenId;
import development.downright.cucumberbeans.integration.fold.GherkinStructureScanner;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
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
