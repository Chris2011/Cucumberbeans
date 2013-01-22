/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.relationships;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import me.dsnet.cetriolo.findimpl.CucumberImplData;
import me.dsnet.cetriolo.findimpl.CucumberImplElement;

/**
 *
 * @author SessonaD
 */
public class AnnotationTableModel extends AbstractTableModel{
    
    
    List<CucumberImplElement> impls;    
    Object[][] data;
    
    public AnnotationTableModel() {
        super();
        impls = CucumberImplData.getImplementationList();              
    }
    
    @Override
    public int getRowCount() {
        return impls.size();   
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public Class getColumnClass(int c) {
        return String.class;
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: {
                return "Annotation text";
            }case 1:{
                return "File";
            }case 2:{
                return "Line";
            }
        }
        return null;
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
            return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CucumberImplElement imp = impls.get(rowIndex);
        switch(columnIndex){
            case 0: {
                return imp.getName();
            }case 1:{
                String filename = imp.getFilename();
                return filename.substring(filename.lastIndexOf("\\" + 1));
            }case 2:{
                return imp.getLine().toString();
            }
        }
        return null;
    }
    
}
