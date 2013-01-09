/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo;

import me.dsnet.cetriolo.antlr.integration.GherkinTokenId;
import me.dsnet.cetriolo.integration.fold.GherkinStructureScanner;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.api.StructureScanner;
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

    @Override
    public boolean hasStructureScanner() {
        return true;
    }

    @Override
    public StructureScanner getStructureScanner() {
        return new GherkinStructureScanner();
    }

}
