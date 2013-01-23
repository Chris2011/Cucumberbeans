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
import me.dsnet.cetriolo.integration.completion.GherkinCompletionNames;
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
        try{
            if (pr == null) {
            return items;
        }else{            
            TokenHierarchy<GherkinTokenId> th = (TokenHierarchy<GherkinTokenId>) pr.getSnapshot().getTokenHierarchy();
            TokenSequence<GherkinTokenId> ts = th.tokenSequence(GherkinTokenId.getLanguage()); 
            GherkingStructureItem feature = null;
            GherkingStructureItem currentScenario = null;
            while (ts.moveNext()) {
                Token<GherkinTokenId> token = ts.token();
                //printToken(token);
                if (token.id().name().equals("FEATURE")) {                    
                    int start = token.offset(th);
                    String titolo = getTitle(ts);
                    feature = new GherkingStructureItem(start,start +1,titolo,GherkinCompletionNames.FEATURE);
                }else if(feature !=null && token.id().name().equals("BACKGROUND")){
                    int start = token.offset(th);
                    String titolo = getTitle(ts);
                    currentScenario = new GherkingStructureItem(start,start +1,titolo,GherkinCompletionNames.BACKGROUND);
                    feature.addChild(currentScenario);
                }else if(feature !=null && token.id().name().equals("SCEN_OUT")){
                    int start = token.offset(th);
                    String titolo = getTitle(ts);
                    currentScenario = new GherkingStructureItem(start,start +1,titolo,GherkinCompletionNames.SCENOUT);
                    feature.addChild(currentScenario);
                }else if(feature !=null && token.id().name().equals("SCENARIO")){
                    int start = token.offset(th);
                    String titolo = getTitle(ts);
                    currentScenario = new GherkingStructureItem(start,start +1,titolo,GherkinCompletionNames.SCENARIO);
                    feature.addChild(currentScenario);
                }else if(feature !=null && currentScenario != null &&token.id().primaryCategory().equals("Stepkeyword")){
                    String text = token.text().toString();
                    GherkinCompletionNames type;
                    if(text.equals("Given ")){           
                        type = GherkinCompletionNames.GIVEN;
                    }else if(text.equals("When ")){       
                        type = GherkinCompletionNames.WHEN;
                    }else if(text.equals("Then ")){
                        type = GherkinCompletionNames.THEN;
                    }else if(text.equals("And ")){
                        type = GherkinCompletionNames.AND;
                    }else if(text.equals("But ")){
                        type = GherkinCompletionNames.BUT;
                    }else{
                        continue;
                    }
                    int start = token.offset(th);
                    String titolo = getTitle(ts);
                    currentScenario.addChild(new GherkingStructureItem(start,start +1,titolo,type));
                }
            }
            items.add(feature);
        }
        }catch(Exception e){}        
        return items;
    }
    
    private static String getTitle(TokenSequence<GherkinTokenId> ts){
        StringBuilder sb = new StringBuilder("");
        while (ts.moveNext()){
            Token<GherkinTokenId> token = ts.token();
            if (token.id().name().equals("NL")) {
                break;
            }else if (token.id().primaryCategory().equals("Text")){
                sb.append(token.text());
                sb.append(" ");
            }
        }
        return sb.toString();
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
            }catch(Exception e){}
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

    public static void printToken(Token token) {
        System.out.println("\n\n### tok id:" + token.id());
        System.out.println("### tok name:" + token.id().name());
        System.out.println("### tok cat:" + token.id().primaryCategory());
        System.out.println("### tok ordinal:" + token.id().ordinal());
        System.out.println("### tok lenght:" + token.length());
        System.out.println("### tok lenght:" + token.text());
    }
    
    @Override
    public Configuration getConfiguration() {
        return new Configuration(true, true);
    }
    

}
