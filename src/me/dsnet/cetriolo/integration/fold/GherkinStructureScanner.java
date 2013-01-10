/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.fold;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.dsnet.cetriolo.antlr.integration.GherkinTokenId;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 *
 * @author SessonaD
 */
public class GherkinStructureScanner implements StructureScanner{

    @Override
    public List<? extends StructureItem> scan(ParserResult pr) {
        System.out.println("######################################################   here");
        List<StructureItem> items = new ArrayList<StructureItem>();
        try{
            if (pr == null) {
            return items;
        }else{
            TokenHierarchy<GherkinTokenId> th = (TokenHierarchy<GherkinTokenId>) pr.getSnapshot().getTokenHierarchy();
            TokenSequence<GherkinTokenId> ts = th.tokenSequence(GherkinTokenId.getLanguage());
            while (ts.moveNext()) {
                Token<GherkinTokenId> token = ts.token();
                    if(token.id().primaryCategory().equals("keyword")){
                        items.add(new FeatureStructureItem(token,th));
                    }
            }
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return items;
    }

    @Override
    public Map<String, List<OffsetRange>> folds(ParserResult pr) {        
        if (pr == null) {
            return Collections.emptyMap();
        }else{
            Map<String, List<OffsetRange>> folds = new HashMap<String, List<OffsetRange>>();
            try{
                //BaseDocument document =(BaseDocument) pr.getSnapshot().getSource().getDocument(true);
                TokenHierarchy<GherkinTokenId> th = (TokenHierarchy<GherkinTokenId>) pr.getSnapshot().getTokenHierarchy();
                TokenSequence<GherkinTokenId> ts = th.tokenSequence(GherkinTokenId.getLanguage());
                List<OffsetRange> ranges = new ArrayList<OffsetRange>();
                List<OffsetRange> commentranges = new ArrayList<OffsetRange>();
                //find starting points
                List<Integer> startingBlocks = new ArrayList<Integer>();
                while (ts.moveNext()) {
                    Token<GherkinTokenId> token = ts.token();
                    if(token.id().primaryCategory().equals("keyword")){
                        while(ts.moveNext()){
                            token = ts.token();
                            if(token.id().name().equals("NL")){
                                break;
                            }
                        }
                        startingBlocks.add(token.offset(th));     
                    //comments
                    }else if (token.id().primaryCategory().equals("comment")){
                        token = ts.token();
                        int startcomment = token.offset(th);
                        while(ts.moveNext()){
                            token = ts.token();
                            if(!token.id().primaryCategory().equals("comment")){
                                ts.movePrevious();
                                token = ts.token();
                                commentranges.add(new OffsetRange(startcomment, token.offset(th) + token.length() -1));
                                break;
                            }
                        }
                    }                    
                }
                //find end point for ranges and add the blocks
                Integer[] blocks= startingBlocks.toArray(new Integer[0]);
                for (int i = 0; i < blocks.length; i++) {
                    if(i  == (blocks.length-1)){
                        ranges.add(new OffsetRange(blocks[i], findEnd(ts, th) ));
                    }else{
                        ranges.add(new OffsetRange(blocks[i], findBeginning(blocks[i+1],ts, th)));
                    }
                }
                folds.put("codeblocks", ranges);
                folds.put("comments", commentranges);
                ts.moveStart();
            }catch(Exception e){
                e.printStackTrace();
            }
            return folds;
        }
    }
    
    private int findBeginning(int offset,TokenSequence<GherkinTokenId> ts,TokenHierarchy<GherkinTokenId> th){
        ts.move(offset -1);
        Token<GherkinTokenId> token = ts.token();
        //find first keyword
        int trim=0;
        while (ts.movePrevious()) {
            token = ts.token();
            if (token.id().primaryCategory().equals("keyword")) {
                while (ts.movePrevious()){
                    token = ts.token();
                    if (!token.id().primaryCategory().equals("whitespace")  && !token.id().primaryCategory().equals("comment")) {
                        token = ts.token();
                        if (token.id().primaryCategory().equals("Table")){
                            trim =1;
                        }
                        break;
                    }
                }
                break;
            }
        }
        return (token.offset(th) + token.length() - trim);
    }
    
    private int findEnd(TokenSequence<GherkinTokenId> ts,TokenHierarchy<GherkinTokenId> th){
        ts.moveEnd();
        ts.movePrevious();
        Token<GherkinTokenId> token = ts.token();
        while (ts.movePrevious()) {
            token = ts.token();
            if (!token.id().primaryCategory().equals("whitespace") && !token.id().primaryCategory().equals("comment")) {
                break;
            }
        }
        return (token.offset(th) + token.length());
    }

//    public static void printToken(Token token) {
//        System.out.println("\n\n### tok id:" + token.id());
//        System.out.println("### tok name:" + token.id().name());
//        System.out.println("### tok cat:" + token.id().primaryCategory());
//        System.out.println("### tok ordinal:" + token.id().ordinal());
//        System.out.println("### tok lenght:" + token.length());
//        System.out.println("### tok lenght:" + token.text());
//    }
    
    @Override
    public Configuration getConfiguration() {
        return new Configuration(true, true);
    }
    

}
