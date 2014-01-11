/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.occurrences;

import java.awt.Color;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JEditorPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyleConstants;
import me.dsnet.cetriolo.integration.completion.GherkinCompletionNames;
import org.netbeans.api.editor.settings.AttributesUtilities;
import org.netbeans.modules.editor.NbEditorUtilities;
import org.netbeans.spi.editor.highlighting.support.OffsetsBag;
import org.openide.cookies.EditorCookie;
import org.openide.loaders.DataObject;
import org.openide.util.RequestProcessor;

/**
 *
 * @author SessonaD
 */
public class OccurrencesHighlighter implements CaretListener {

    private static final AttributeSet defaultColors =AttributesUtilities.createImmutable(StyleConstants.Background,new Color(236, 235, 163));
    private final OffsetsBag bag;
    private JTextComponent comp;
    private final WeakReference<Document> weakDoc;
    private final RequestProcessor rp;
    private final static int DELAY = 100;
    private RequestProcessor.Task refreshTask;
    static List<String> keywords=GherkinCompletionNames.getKeywordsFormatching();

    public OccurrencesHighlighter(Document doc) {
        rp = new RequestProcessor(OccurrencesHighlighter.class);
        bag = new OffsetsBag(doc);
        weakDoc = new WeakReference<Document>((Document) doc);
        DataObject dobj = NbEditorUtilities.getDataObject(weakDoc.get());
        if (dobj != null) {
            EditorCookie pane = dobj.getLookup().lookup(EditorCookie.class);
            JEditorPane[] panes = pane.getOpenedPanes();
            if (panes != null && panes.length > 0) {
                comp = panes[0];
                comp.addCaretListener(this);
            }
        }
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        bag.clear();
        setupAutoRefresh();
    }
           
    
    public void setupAutoRefresh() {
        if (refreshTask == null) {
            refreshTask = rp.create(new Runnable() {
                @Override
                public void run() {
                    String selection = comp.getSelectedText();
                    if (selection != null && !isKeyword(selection)) {
                        Pattern p = Pattern.compile(selection);   
                        Matcher m = p.matcher(comp.getText());
                        //for some reason the matcher skips the \n chars
                        //so i am finding them all and subtracting them
                        //from the resulting start and end offset. 
                        while (m.find() == true) {
                            int startOffset = m.start();
                            int numberOfLineFeed= comp.getText().substring(0, startOffset).split("\n").length -1;
                            startOffset = startOffset - numberOfLineFeed;
                            int endOffset = m.end() - numberOfLineFeed;
                            bag.addHighlight(startOffset, endOffset, defaultColors);
                        }
                    }
                }
            });
            refreshTask.setPriority(Thread.MIN_PRIORITY);
        }
        refreshTask.schedule(DELAY);
    }
    
    public boolean isKeyword(String selection){
        return keywords.contains(selection);
    }
    
    public OffsetsBag getHighlightsBag() {
        return bag;
    }
}
