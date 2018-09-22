/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans.integration.palette;

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.openide.text.ActiveEditorDrop;

/**
 *
 * @author SessonaD
 */
abstract public class BasePaletteActiveEditor implements ActiveEditorDrop {
    
    abstract public String createBody();
    
    @Override
    public boolean handleTransfer(JTextComponent component) {
        String body = createBody();
        try {
            if(body!=null){
                GherkinPaletteUtils.insert(body, component);
            }            
        } catch (BadLocationException ble) {
            return false;
        }
        return true;
    }
}
