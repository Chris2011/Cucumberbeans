/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.indent;

import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.IndentTask;

/**
 *
 * @author SessonaD
 */
public class GherkinIndentTaskFactory implements IndentTask.Factory{

    @Override
    public IndentTask createTask(Context cntxt) {
        System.out.println("**** initializing indentation");
        return new GherkinIndentTask(cntxt);
    }
    
}
