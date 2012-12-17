/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.tasks;

import javax.swing.text.BadLocationException;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

/**
 *
 * @author SessonaD
 */
public class GherkinReformatTask implements ReformatTask{

    private Context context;

    public GherkinReformatTask(Context context) {
        this.context = context;
    }
    
    @Override
    public void reformat() throws BadLocationException {
        System.out.println("we will format this now");
    }

    @Override
    public ExtraLock reformatLock() {
        return null;
    }
    
}
