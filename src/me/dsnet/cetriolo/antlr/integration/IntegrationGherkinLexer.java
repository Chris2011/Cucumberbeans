/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.antlr.integration;

import me.dsnet.cetriolo.antlr.output.GherkinLexer;
import org.antlr.runtime.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;
/**
 *
 * @author SessonaD
 */
public class IntegrationGherkinLexer implements Lexer<GherkinTokenId> {

    private LexerRestartInfo<GherkinTokenId> info;

    private GherkinLexer oracleLexer;

    public IntegrationGherkinLexer(LexerRestartInfo<GherkinTokenId> info) {
        this.info = info;

        IntegrationAntlrCharStream charStream = new IntegrationAntlrCharStream(info.input(), "GherkinEditor");
        oracleLexer = new GherkinLexer(charStream);
    }

    @Override
    public org.netbeans.api.lexer.Token<GherkinTokenId> nextToken() {
        Token token = oracleLexer.nextToken();
        if (info.input().readLength() < 1) {
          return null;
        }else if (token!=null && token.getType() != GherkinLexer.EOF) {
            //System.out.println("token: " + token.getText());
            GherkinTokenId tokenId = GherkinLanguageHierarchy.getToken(token.getType());
            //System.out.println("\"token: \" " + tokenId.name());
            return info.tokenFactory().createToken(tokenId);
        }else{
            //System.out.println("end token null ");
            //System.out.println("token: " + token.getText());
            //return info.tokenFactory().createToken(GherkinLanguageHierarchy.getToken(19));
            return null;
        }
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {}
}

