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
                while (ts.moveNext()) {
                    Token<GherkinTokenId> token = ts.token();
                    System.out.println("### tok id:" + token.id());
                    System.out.println("### tok: " + token.toString());
                }
                folds.put("codeblocks", ranges);
            }catch(Exception e){
                System.out.println("############## Exception in structure scanner");
                e.printStackTrace();
            }
            return folds;
        }
        
        /**
         * if (pr == null) {
            return Collections.emptyMap();
        }
        try {
            Map<String, List<OffsetRange>> folds = new HashMap<String, List<OffsetRange>>();
            BaseDocument document = (BaseDocument) pr.getSnapshot().getSource().getDocument(true);
            TokenHierarchy<CoffeeScriptTokenId> th = (TokenHierarchy<CoffeeScriptTokenId>) pr.getSnapshot().getTokenHierarchy();
            TokenSequence<CoffeeScriptTokenId> ts = th.tokenSequence(CoffeeScriptLanguage.getLanguage());
            List<OffsetRange> ranges = new ArrayList<OffsetRange>();
            Deque<IdentRegion> indents = new ArrayDeque<IdentRegion>();
         */
        
        
        /**
         * OffsetRange range = new OffsetRange(10, 280);
        OffsetRange range2 = new OffsetRange(400, 600);
        ArrayList<OffsetRange> list = new ArrayList<OffsetRange>();
        * list.add(range);
        list.add(range2);
        * ret.put("codeblocks", list);
        return ret;
        * 
        * 
         */
    }

    @Override
    public Configuration getConfiguration() {
        System.out.println("############## here 2");
        return new Configuration(true, true);
    }
    

}
