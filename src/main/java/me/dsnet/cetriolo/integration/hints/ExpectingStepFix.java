/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.hints;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.text.Document;
import me.dsnet.cetriolo.integration.completion.GherkinCompletionNames;
import me.dsnet.cetriolo.integration.palette.dialogues.StepsDialog;
import org.netbeans.spi.editor.hints.ChangeInfo;
import org.netbeans.spi.editor.hints.Fix;

/**
 *
 * @author sessonad
 */
public class ExpectingStepFix implements Fix{
    
    Document document;
    int offset;
    GherkinCompletionNames type;
    
    public ExpectingStepFix(Document document, int offset,GherkinCompletionNames type) {            
        this.document=document;
        this.offset = offset;
        this.type=type;
    }
    
    @Override
    public String getText() {
        return "Add a \""+type.getDisplay()+"\" step ..." ;
    }

    @Override
    public ChangeInfo implement() throws Exception {        
        ChangeInfo changes = new ChangeInfo();
        String body = createBody();
        if(body!=null){
            document.insertString(offset, body, null);
        }        
        return changes;
    }
    
    public String createBody() {
        try {
            StepsDialog dialogue = new StepsDialog(null, true, type);
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
                return "      " + userCommand + "\n";
            }                       
        } catch (Exception e) {
            return null;
        }
    }
    
}