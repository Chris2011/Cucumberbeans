/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans.relationships;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SessonaD
 */
public class StepTableModel extends AbstractTableModel{
    
    int columns = 3;
    int rows;
    
    Object[][] data;
    
    public StepTableModel() {
        super();        
        this.rows=rows;
        data= new String[rows][columns];
    }
    
    @Override
    public int getRowCount() {
        return rows;
    }

    @Override
    public int getColumnCount() {
        return columns;
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
        return data[rowIndex][columnIndex];
    }
}
