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
        List<StructureItem> items = new ArrayList<StructureItem>();
        return items;
    }

    @Override
    public Map<String, List<OffsetRange>> folds(ParserResult pr) {
        System.out.println("############## in folds of the structure scanner");
        if (pr == null) {
            System.out.println("############## parse result is null, returning empty map.");
            return Collections.emptyMap();
        }else{
            Map<String, List<OffsetRange>> folds = new HashMap<String, List<OffsetRange>>();
            try{
                //BaseDocument document =(BaseDocument) pr.getSnapshot().getSource().getDocument(true);
                TokenHierarchy<GherkinTokenId> th = (TokenHierarchy<GherkinTokenId>) pr.getSnapshot().getTokenHierarchy();
                TokenSequence<GherkinTokenId> ts = th.tokenSequence(GherkinTokenId.getLanguage());
                List<OffsetRange> ranges = new ArrayList<OffsetRange>();
                
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
                    }                       
                }
                
                
                
                Integer[] blocks= startingBlocks.toArray(new Integer[0]);
                for (int i = 0; i < blocks.length; i++) {
                    if(i  == (blocks.length-1)){
                        ranges.add(new OffsetRange(blocks[i], findEnd(ts, th) ));
                    }else{
                        ranges.add(new OffsetRange(blocks[i], blocks[i] + 100));
                    }
                }
                
                
                
                folds.put("codeblocks", ranges);
            }catch(Exception e){
                System.out.println("############## Exception in structure scanner");
                e.printStackTrace();
            }
            return folds;
        }
    }
    
    public int findEnd(TokenSequence<GherkinTokenId> ts,TokenHierarchy<GherkinTokenId> th){
        ts.moveEnd();
        ts.movePrevious();
        Token<GherkinTokenId> token = ts.token();
        while (ts.movePrevious()) {
            token = ts.token();
            if (!token.id().primaryCategory().equals("whitespace")) {
                break;
            }
        }
        return (token.offset(th) + token.length());
    }

    public static void printToken(Token token){
            System.out.println("\n\n### tok id:" + token.id());
                    System.out.println("### tok name:" + token.id().name());
                    System.out.println("### tok cat:" + token.id().primaryCategory());
                    System.out.println("### tok ordinal:" + token.id().ordinal());
                    System.out.println("### tok lenght:" + token.length()); 
                    System.out.println("### tok lenght:" + token.text()); 
        }
    
    @Override
    public Configuration getConfiguration() {
        System.out.println("############## here 2");
        return new Configuration(true, true);
    }
    

}
