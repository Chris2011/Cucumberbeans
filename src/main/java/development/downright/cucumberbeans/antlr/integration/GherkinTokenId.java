package development.downright.cucumberbeans.antlr.integration;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;
/**
 *
 * @author Downright-Development
 */
public class GherkinTokenId implements TokenId {

    private static final Language<GherkinTokenId> LANGUAGE 
            = new GherkinLanguageHierarchy().language();
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
        return LANGUAGE;
    }
}

