/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.palette;

import java.awt.Dimension;
import java.awt.Toolkit;
import me.dsnet.cetriolo.integration.completion.GherkinCompletionNames;
import me.dsnet.cetriolo.integration.palette.dialogues.NarrativeDialog;

/**
 *
 * @author SessonaD
 */
public class PaletteAsA extends BasePaletteActiveEditor {

    @Override
    public String createBody() {
        try {
            NarrativeDialog dialogue = new NarrativeDialog(null, true, GherkinCompletionNames.AS_A);
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
                return GherkinCompletionNames.AS_A.getDisplay() + userCommand;
            }
                       
        } catch (Exception e) {
            return null;
        }
    }

}
