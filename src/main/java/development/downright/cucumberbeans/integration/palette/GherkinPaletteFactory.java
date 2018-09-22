/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans.integration.palette;


import java.io.IOException;
import javax.swing.Action;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.palette.DragAndDropHandler;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteController;
import org.netbeans.spi.palette.PaletteFactory;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.datatransfer.ExTransferable;
/**
 *
 * @author SessonaD
 */
public class GherkinPaletteFactory {
    
    private static PaletteController palette = null;

    public static PaletteController createPalette() {
        try {
            if (null == palette) {
                return PaletteFactory.createPalette(
                //Folder:      
                "GherkinPalette", 
                //Palette Actions:
                new PaletteActions() {
                    @Override public Action[] getImportActions() {return null;}
                    @Override public Action[] getCustomPaletteActions() {return null;}
                    @Override public Action[] getCustomCategoryActions(Lookup lkp) {return null;}
                    @Override public Action[] getCustomItemActions(Lookup lkp) {return null;}
                    @Override public Action getPreferredAction(Lookup lkp) {return null;}
                }, 
                //Palette Filter:  
                null, 
                //Drag and Drop Handler:  
                new DragAndDropHandler(true) {
                    @Override public void customize(ExTransferable et, Lookup lkp) {}
                });
            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return null;
    }
    
}
