/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.completion;

import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;

/**
 *
 * @author SessonaD
 */
public class GherkinCompletionDocumentation implements CompletionDocumentation{

    private GherkinCompletionItem item;

    public GherkinCompletionDocumentation(GherkinCompletionItem item) {
        this.item = item;
    }
    
     @Override
    public String getText() {
        return "Information about " + item.text;
    }

    @Override
    public URL getURL() {
        return null;
    }

    @Override
    public CompletionDocumentation resolveLink(String string) {
        return null;
    }

    @Override
    public Action getGotoSourceAction() {
        return null;
    }
    
}
