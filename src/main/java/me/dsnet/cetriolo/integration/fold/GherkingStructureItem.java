/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.fold;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import me.dsnet.cetriolo.integration.completion.GherkinCompletionNames;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.StructureItem;

/**
 *
 * @author SessonaD
 */
public class GherkingStructureItem implements StructureItem {

    int start=0;
    int end=0;
    String title;
    GherkinCompletionNames keyword;
    List<StructureItem> children;
    public static final String FONT_GRAY_COLOR = "<font color=\"#999999\">";
    public static final String CLOSE_FONT      = "</font>";
    public static final int TITLE_LENGHT       = 25;

    public GherkingStructureItem(int start, int end,String title, GherkinCompletionNames keyword) {
        this.keyword=keyword;
        this.start = start;
        this.end=end;
        this.title=title;
        children = new ArrayList<StructureItem>();
    }
    
    @Override
    public String getHtml(HtmlFormatter hf) {
        hf.reset();        
        String nodeValue = getName();
        if (nodeValue.length() > TITLE_LENGHT) {
            nodeValue = nodeValue.substring(0, TITLE_LENGHT) + "...";
        }
        hf.appendText(nodeValue);
        hf.appendHtml( " : " + FONT_GRAY_COLOR);
        hf.appendText(keyword.getWord());
        hf.appendHtml(CLOSE_FONT);
        return hf.getText();
    }
    
    public void addChild(StructureItem p){
        children.add(p);
    }
    
    @Override
    public String getName() {
        return title;
    }

    @Override
    public String getSortText() {
        return Integer.toString(keyword.priority);
    }

    @Override
    public ElementHandle getElementHandle() {
        return null;
    }

    @Override
    public ElementKind getKind() {
        return ElementKind.PROPERTY;
    }

    @Override
    public Set<Modifier> getModifiers() {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return (children.isEmpty());
    }

    @Override
    public List<? extends StructureItem> getNestedItems() {
        return children;
    }

    @Override
    public long getPosition() {
        return start;
    }

    @Override
    public long getEndPosition() {
        return end;
    }

    @Override
    public ImageIcon getCustomIcon() {
        return new javax.swing.ImageIcon(keyword.getIcon(16));
    }
    
}
