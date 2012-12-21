/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.palette;

import java.awt.Dimension;
import java.awt.Toolkit;
import me.dsnet.cetriolo.integration.completion.GerkinCompletionNames;
import me.dsnet.cetriolo.integration.palette.dialogues.StepDialog;

/**
 *
 * @author SessonaD
 */
public class PaletteGiven extends BasePaletteActiveEditor {

    @Override
    public String createBody() {
        try {
            StepDialog dialogue = new StepDialog(null, true, GerkinCompletionNames.GIVEN);
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
                return GerkinCompletionNames.GIVEN.getDisplay() + userCommand;
            }
                       
        } catch (Exception e) {
            return null;
        }
    }

}
