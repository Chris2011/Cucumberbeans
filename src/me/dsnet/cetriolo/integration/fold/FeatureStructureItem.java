/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.fold;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import me.dsnet.cetriolo.antlr.integration.GherkinTokenId;
import me.dsnet.cetriolo.integration.completion.GherkinCompletionNames;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.StructureItem;

/**
 *
 * @author SessonaD
 */
public class FeatureStructureItem implements StructureItem {

    Token<GherkinTokenId> token;
    TokenHierarchy<GherkinTokenId> th;

    public FeatureStructureItem(Token<GherkinTokenId> token,TokenHierarchy<GherkinTokenId> th) {
        this.token=token;
        this.th=th;
    }
    
    @Override
    public String getName() {
        return "Feature";
    }

    @Override
    public String getSortText() {
        return "Feature sorted text";
    }

    @Override
    public String getHtml(HtmlFormatter hf) {
        return "html";
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
        return false;
    }

    @Override
    public List<? extends StructureItem> getNestedItems() {
        return Collections.emptyList();
    }

    @Override
    public long getPosition() {
        return token.offset(th);
    }

    @Override
    public long getEndPosition() {
        return token.offset(th) + 100;
    }

    @Override
    public ImageIcon getCustomIcon() {
        return new javax.swing.ImageIcon(GherkinCompletionNames.FEATURE.getIcon(16));
    }
    
}
