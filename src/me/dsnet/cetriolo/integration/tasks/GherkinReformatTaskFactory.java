/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.tasks;

import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

/**
 *
 * @author SessonaD
 */
public class GherkinReformatTaskFactory implements ReformatTask.Factory {

    public ReformatTask createTask(Context context) {
        return new GherkinReformatTask(context);
    }
}
    
