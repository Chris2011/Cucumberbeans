/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo;

import me.dsnet.cetriolo.antlr.integration.GherkinTokenId;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
/**
 *
 * @author SessonaD
 */

public class GherkinLanguage extends DefaultLanguageConfig{
    
    @Override
    public Language getLexerLanguage() {
        return GherkinTokenId.getLanguage();
    }

    @Override
    public String getDisplayName() {
        return "Cucumber";
    }
}
