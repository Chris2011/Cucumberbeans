/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.fold;

import org.netbeans.spi.editor.fold.FoldManager;
import org.netbeans.spi.editor.fold.FoldManagerFactory;

/**
 *
 * @author SessonaD
 */
public class GherkinFolderManagerFactory implements FoldManagerFactory{

    @Override
    public FoldManager createFoldManager() {
        System.out.println("********************** Created gerking fold manager....");
        return new GherkinFoldManager();
    }
    
}
