package me.dsnet.cetriolo.relationships;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.table.AbstractTableModel;
import me.dsnet.cetriolo.findimpl.CucumberImplData;
import me.dsnet.cetriolo.findimpl.CucumberImplElement;

/**
 *
 * @author SessonaD
 */
public class AnnotationTableModel extends AbstractTableModel {
    List<CucumberImplElement> impls;
    Object[][] data;
    boolean isStep;
    String filter;

    public AnnotationTableModel(boolean isStep, String filter) {
        super();
        this.isStep = isStep;
        this.filter = filter;
        impls = (isStep) ? CucumberImplData.getStepsList() : CucumberImplData.getImplementationList();
        if (filter != null) {
            List<CucumberImplElement> tmp = new ArrayList<>();
            for (CucumberImplElement elem : impls) {
                if (isStep && isValidMatch(elem.getName(), filter)) {
                    tmp.add(elem);
                } else if (!isStep && isValidMatch(filter, elem.getName())) {
                    tmp.add(elem);
                }
            }
            impls = tmp;
        }
        Collections.sort(impls);
    }

    private static boolean isValidMatch(String stepDesc, String annotation) {
        boolean isMatch = false;
        String annotation1 = annotation.replaceAll("\\\\d", "\\d");
        if (Pattern.matches(annotation1, stepDesc.trim())) {
            isMatch = true;
        }
        return isMatch;
    }

    public String getFilter() {
        return filter;
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
        switch (col) {
            case 0: {
                return (isStep) ? "Step definition" : "Annotation text";
            }
            case 1: {
                return "File";
            }
            case 2: {
                return "Line";
            }
        }
        return null;
    }

    public CucumberImplElement getElementAtRow(int row) {
        return impls.get(row);
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CucumberImplElement imp = impls.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                return imp.getName();
            }
            case 1: {
                String filename = imp.getFilename();
                return filename;//.substring(filename.lastIndexOf("\\" + 1));
            }
            case 2: {
                return imp.getLine().toString();
            }
        }
        return null;
    }
}