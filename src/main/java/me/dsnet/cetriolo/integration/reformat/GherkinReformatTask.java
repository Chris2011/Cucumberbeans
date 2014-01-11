/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.reformat;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import me.dsnet.cetriolo.antlr.integration.GherkinTokenId;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

/**
 *
 * @author SessonaD
 */
public class GherkinReformatTask implements ReformatTask{

    private Context context;
    private Document doc;
    Map<Integer, Token<GherkinTokenId>> indents = new TreeMap<Integer, Token<GherkinTokenId>> ();
    
    public GherkinReformatTask(Context context) {
        this.context = context;
        this.doc=context.document();
    }
    
    @Override
    public void reformat() throws BadLocationException {
        populateMapIndents();
        int offset=0;
        for(Entry<Integer, Token<GherkinTokenId>> e: indents.entrySet()){
            Token<GherkinTokenId> token = e.getValue();
            if (token.id().primaryCategory().equals("Stepkeyword")||
                    token.id().primaryCategory().equals("keyword")||
                    token.id().primaryCategory().equals("Featurekeyword")||
                    token.id().primaryCategory().equals("Table")) {
                
                int newStartline = context.lineStartOffset(e.getKey() + offset);
                int currentindent = context.lineIndent(newStartline);
                int newiNdentValue= getIndentationLenghtForToken(token);
                int modified = newiNdentValue - currentindent;
                context.modifyIndent(newStartline, newiNdentValue);
                offset += modified;
            }            
        }
    }
    
    private int getIndentationLenghtForToken(Token<GherkinTokenId> token){
        if(token.id().name().equals("FEATURE")){
            return 0;
        }else if(token.id().primaryCategory().equals("Stepkeyword")){
            return 6;
        }else if(token.id().primaryCategory().equals("Table")){
            return 9;
        }else{
            return 3;
        }
    }
    
    private void populateMapIndents() throws BadLocationException {
        int start = context.startOffset();
        start = context.lineStartOffset(start);
        int end = context.endOffset();
        System.out.println("format from: " + start + " to:" + end);
        TokenHierarchy th =  TokenHierarchy.get(doc);
        TokenSequence<GherkinTokenId> ts = th.tokenSequence(GherkinTokenId.getLanguage());
        ts.move(start);
        Token<GherkinTokenId> token;
        while (ts.moveNext()){
            token = ts.token();
            if(token.offset(th) >= end){
                break;
            }else{
                Token<GherkinTokenId> firstvalid = findFirstValidToken(th, ts);
                try{                    
                    indents.put(context.lineStartOffset(firstvalid.offset(th)), firstvalid);
                }catch(NullPointerException e){}
                moveToNextLine(th, ts);
            }
        }        
    }
    
    public static void moveToNextLine(TokenHierarchy th,TokenSequence<GherkinTokenId> ts){
        Token<GherkinTokenId> token= ts.token();
        if(token.id().name().equals("NL")||token.id().primaryCategory().equals("Table")){
            return;
        }
        while (ts.moveNext()){
            token = ts.token();
            if(token.id().name().equals("NL")||token.id().primaryCategory().equals("Table")){
                break;
            }
        }
    }
    
    public static Token<GherkinTokenId> findFirstValidToken(TokenHierarchy th,TokenSequence<GherkinTokenId> ts){
        Token<GherkinTokenId> token=ts.token();
        if(!token.id().primaryCategory().equals("whitespace")){
                return token;
        }
        while (ts.moveNext()){
            token = ts.token();
            if(!token.id().primaryCategory().equals("whitespace")){
                return token;
            }
        }
        return null;
    }
    
    @Override
    public ExtraLock reformatLock() {
        return null;
    }
    
}
