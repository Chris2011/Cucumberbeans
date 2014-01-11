/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.occurrences;

import javax.swing.text.Document;
import org.netbeans.spi.editor.highlighting.HighlightsLayer;
import org.netbeans.spi.editor.highlighting.HighlightsLayerFactory;
import org.netbeans.spi.editor.highlighting.ZOrder;

/**
 *
 * @author SessonaD
 */
public class OccurrencesHighlighterFactory implements HighlightsLayerFactory {

    public static OccurrencesHighlighter getMarkOccurrencesHighlighter(Document doc) {
        OccurrencesHighlighter highlighter =(OccurrencesHighlighter) doc.getProperty(OccurrencesHighlighter.class);
        if (highlighter == null) {
            doc.putProperty(OccurrencesHighlighter.class, highlighter = new OccurrencesHighlighter(doc));
        }
        return highlighter;
    }

    @Override
    public HighlightsLayer[] createLayers(Context cntxt) {
        return new HighlightsLayer[]{
                    HighlightsLayer.create(
                    OccurrencesHighlighter.class.getName(),
                    ZOrder.CARET_RACK.forPosition(2000),
                    true,
                    getMarkOccurrencesHighlighter(cntxt.getDocument()).getHighlightsBag())
                };
    }
}
