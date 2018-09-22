/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans.integration.palette;

import java.awt.Dimension;
import java.awt.Toolkit;
import development.downright.cucumberbeans.integration.completion.GherkinCompletionNames;
import development.downright.cucumberbeans.integration.palette.dialogues.NarrativeDialog;

/**
 *
 * @author SessonaD
 */
public class PaletteInOrder extends BasePaletteActiveEditor {

    @Override
    public String createBody() {
        try {
            NarrativeDialog dialogue = new NarrativeDialog(null, true, GherkinCompletionNames.IN_ORDER);
            //center on screen
            final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            final int x = (screenSize.width - dialogue.getWidth()) / 2;
            final int y = (screenSize.height - dialogue.getHeight()) / 2;
            dialogue.setLocation(x, y);
            dialogue.setVisible(true);
            
            String userCommand = dialogue.getDescription();
            if(userCommand==null){
                return null;
            }else{
                return GherkinCompletionNames.IN_ORDER.getDisplay() + userCommand;
            }
                       
        } catch (Exception e) {
            return null;
        }
    }

}
