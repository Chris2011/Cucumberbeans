/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans.integration.palette;

import java.awt.Dimension;
import java.awt.Toolkit;
import development.downright.cucumberbeans.integration.palette.dialogues.PholderDialog;

/**
 *
 * @author SessonaD
 */
public class PalettePlaceHolder extends BasePaletteActiveEditor {

    @Override
    public String createBody() {
        try {
            PholderDialog dialogue = new PholderDialog(null, true);
            //center on screen
            final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            final int x = (screenSize.width - dialogue.getWidth()) / 2;
            final int y = (screenSize.height - dialogue.getHeight()) / 2;
            dialogue.setLocation(x, y);
            dialogue.setVisible(true);
            
            String userCommand = dialogue.getDescription();
            if(userCommand==null || userCommand.isEmpty()){
                return null;
            }else{
                return " <" +userCommand +">";
            }                       
        } catch (Exception e) {
            return null;
        }
    }

}
