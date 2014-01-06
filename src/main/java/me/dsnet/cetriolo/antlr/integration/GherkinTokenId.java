/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.antlr.integration;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;
/**
 *
 * @author SessonaD
 */
public class GherkinTokenId implements TokenId {

    private static final Language<GherkinTokenId> language = new GherkinLanguageHierarchy().language();
    private final String name;
    private final String primaryCategory;
    private final int id;

    public GherkinTokenId(String name, String primaryCategory, int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }

    public String primaryCategory() {
        return primaryCategory;
    }

    public int ordinal() {
        return id;
    }

    public String name() {
        return name;
    }

    public static final Language<GherkinTokenId> getLanguage() {
        return language;
    }
}

