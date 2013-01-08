/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.completion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;
import org.openide.util.Exceptions;

/**
 *
 * @author SessonaD
 */
public class GherkinCompletionDocumentation implements CompletionDocumentation{

    private GherkinCompletionNames keyword;

    public GherkinCompletionDocumentation(GherkinCompletionNames keyword) {
        this.keyword = keyword;
    }
    
     @Override
    public String getText() {
        return keyword.getDocumentation();
    }

    @Override
    public URL getURL() {
        try {
            return new URL("http://cukes.info/");
        } catch (MalformedURLException ex) {
            return null;
        }
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
