/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.fold;

import javax.swing.event.DocumentEvent;
import org.netbeans.api.editor.fold.Fold;
import org.netbeans.spi.editor.fold.FoldHierarchyTransaction;
import org.netbeans.spi.editor.fold.FoldManager;
import org.netbeans.spi.editor.fold.FoldOperation;

/**
 *
 * @author SessonaD
 */
public class GherkinFoldManager implements FoldManager{

    @Override
    public void init(FoldOperation fo) {
        System.out.println("init");
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void initFolds(FoldHierarchyTransaction fht) {
        System.out.println("****************** inifolds");
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void insertUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        System.out.println("****************** insertupdate");
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        System.out.println("****************** removeupdate");
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void changedUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        System.out.println("****************** changedupdate");
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeEmptyNotify(Fold fold) {
        System.out.println("****************** removed empty");
      //  throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeDamagedNotify(Fold fold) {
         System.out.println("****************** removeDamagedNotify");
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void expandNotify(Fold fold) {
         System.out.println("****************** expandNotify");
      //  throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void release() {
         System.out.println("****************** release");
      //  throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
