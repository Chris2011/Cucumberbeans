/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans.integration.completion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JToolTip;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import org.netbeans.api.editor.completion.Completion;
import org.netbeans.spi.editor.completion.CompletionItem;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.netbeans.spi.editor.completion.support.CompletionUtilities;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;

/**
 *
 * @author SessonaD
 */
public class GherkinCompletionItem implements CompletionItem{

    
    GherkinCompletionNames keyword;
    private int caretOffset;
    private int dotOffset;
    
    public GherkinCompletionItem(GherkinCompletionNames keyword, int caretOffset, int dotOffset) {
        this.keyword = keyword;
        this.caretOffset = caretOffset;
        this.dotOffset = dotOffset;
    }
    
    @Override
    public int getPreferredWidth(Graphics graphics, Font font) {
        return CompletionUtilities.getPreferredWidth(keyword.getDisplay(), null, graphics, font);
    }

    @Override
    public void render(Graphics g, Font defaultFont, Color defaultColor,Color backgroundColor, int width, int height, boolean selected) {
        ImageIcon icon = new ImageIcon(keyword.getIcon(16));            
        CompletionUtilities.renderHtml(icon, keyword.getDisplay(), null, g, defaultFont,(selected ? Color.white : Color.BLUE), width, height, selected);
    }
    
    @Override
    public void defaultAction(JTextComponent jtc) {
        try {
            StyledDocument doc = (StyledDocument) jtc.getDocument();
//            System.out.println("dotoffset: " + dotOffset);
//            System.out.println("caretOffset: " + caretOffset);
            int delta = dotOffset - caretOffset;
//            System.out.println("caretOffset - dotOffset:" +( delta));
            doc.remove(caretOffset,  delta);
            doc.insertString(dotOffset - (delta), keyword.getDisplay(), null);
            Completion.get().hideAll();
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public void processKeyEvent(KeyEvent ke) {
        
    }

    

    @Override
    public CompletionTask createDocumentationTask() {
        return new AsyncCompletionTask(new AsyncCompletionQuery() {
            @Override
            protected void query(CompletionResultSet completionResultSet, Document document, int i) {
                completionResultSet.setDocumentation(new GherkinCompletionDocumentation(GherkinCompletionItem.this.keyword));
                completionResultSet.finish();
            }
        });
    }

    @Override
    public CompletionTask createToolTipTask() {
        return new AsyncCompletionTask(new AsyncCompletionQuery() {
            @Override
            protected void query(CompletionResultSet completionResultSet, Document document, int i) {
                JToolTip toolTip = new JToolTip();
                toolTip.setTipText("Press Enter to insert \"" + keyword.getDisplay() + "\"");
                completionResultSet.setToolTip(toolTip);
                completionResultSet.finish();
            }
        });
    }

    @Override
    public boolean instantSubstitution(JTextComponent jtc) {
        return false;
    }

    @Override
    public int getSortPriority() {
        return keyword.getPriority();
    }

    @Override
    public CharSequence getSortText() {
        return keyword.getDisplay();
    }

    @Override
    public CharSequence getInsertPrefix() {
        return keyword.getDisplay();
    }
    
}
