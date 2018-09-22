package development.downright.cucumberbeans.antlr.integration;

import development.downright.cucumberbeans.antlr.GherkinLexer;
import org.antlr.runtime.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author SessonaD
 */
public class IntegrationGherkinLexer implements Lexer<GherkinTokenId> {
    private final LexerRestartInfo<GherkinTokenId> info;
    private final GherkinLexer oracleLexer;

    public IntegrationGherkinLexer(LexerRestartInfo<GherkinTokenId> info) {
        this.info = info;

        IntegrationAntlrCharStream charStream = new IntegrationAntlrCharStream(info.input(), "GherkinEditor");
        oracleLexer = new GherkinLexer(charStream);
    }

    @Override
    public org.netbeans.api.lexer.Token<GherkinTokenId> nextToken() {
        Token token = oracleLexer.nextToken();

        if (token.getType() != GherkinLexer.EOF) {
            GherkinTokenId tokenId = GherkinLanguageHierarchy.getToken(token.getType());
            final org.netbeans.api.lexer.Token<GherkinTokenId> createToken = info.tokenFactory().createToken(tokenId);

            assert createToken != null;
            return createToken;
        }

        return null;

//        if (info.input().readLength() < 1) {
//            return null;
//        } else if (token != null && token.getType() != GherkinLexer.EOF) {
//            //System.out.println("token: " + token.getText());
//            GherkinTokenId tokenId = GherkinLanguageHierarchy.getToken(token.getType());
//            //System.out.println("\"token: \" " + tokenId.name());
//            return info.tokenFactory().createToken(tokenId);
//        } else {
//            //System.out.println("end token null ");
//            //System.out.println("token: " + token.getText());
//            //return info.tokenFactory().createToken(GherkinLanguageHierarchy.getToken(19));
//            return null;
//        }
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {}
}