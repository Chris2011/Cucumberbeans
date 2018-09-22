/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans.integration.hints;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.text.Document;
import development.downright.cucumberbeans.integration.completion.GherkinCompletionNames;
import development.downright.cucumberbeans.integration.palette.dialogues.ScenarioDialog;
import org.netbeans.spi.editor.hints.ChangeInfo;
import org.netbeans.spi.editor.hints.Fix;

/**
 *
 * @author sessonad
 */
public class ExpectingScenarioFix implements Fix{
    
    Document document;
    int offset;
    GherkinCompletionNames type;
    
    public ExpectingScenarioFix(Document document, int offset,GherkinCompletionNames type) {            
        this.document=document;
        this.offset = offset;
        this.type=type;
    }
    
    @Override
    public String getText() {
        return "Add a \""+type.getDisplay()+"\" block ..." ;
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
            ScenarioDialog dialogue = new ScenarioDialog(null, true, type);
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
                return "\n      " + userCommand + "\n";
            }                       
        } catch (Exception e) {
            return null;
        }
    }
    
}