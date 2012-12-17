/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.tasks;

import javax.swing.text.BadLocationException;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.IndentTask;
import org.openide.awt.StatusDisplayer;

/**
 *
 * @author SessonaD
 */
public class GherkinIndentTask implements IndentTask{

    private Context context;

    GherkinIndentTask(Context context) {
        this.context = context;
    }
    
    @Override
    public void reindent() throws BadLocationException {
        StatusDisplayer.getDefault().setStatusText("We will indent this now...");
    }

    @Override
    public ExtraLock indentLock() {
        return null;
    }
    
}
