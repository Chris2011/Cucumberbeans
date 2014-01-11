/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.palette.dialogues;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SessonaD
 */
public class CustomTableModel extends AbstractTableModel{

    int columns;
    int rows;
    
    Object[][] data;
    
    public CustomTableModel(int columns, int rows) {
        super();
        this.columns=columns;
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
        return "Column " + (col +1 );
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
            return true;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
}
