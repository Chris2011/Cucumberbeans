/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.palette;

import java.awt.Dimension;
import java.awt.Toolkit;
import me.dsnet.cetriolo.integration.palette.dialogues.CommentDialog;

/**
 *
 * @author SessonaD
 */
public class PaletteComment extends BasePaletteActiveEditor {

    @Override
    public String createBody() {
        try {
            CommentDialog dialogue = new CommentDialog(null, true);
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
                return getMultilineComment(userCommand);
            }                       
        } catch (Exception e) {
            return null;
        }
    }

    public String getMultilineComment(String initialtext){
        StringBuilder sb = new StringBuilder();
        String[] lines = initialtext.split("\n");
        for(String line:lines){
            sb.append("# ");
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    }
}
