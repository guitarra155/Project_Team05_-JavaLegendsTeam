package ec.edu.espe.MedicalPro.controller;

import ec.edu.espe.MedicalPro.controller.Personal;
import ec.edu.espe.MedicalPro.controller.Personal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Grupo 05 JavaLegends 
 * Insuasti
 * Guzman
 * Guitarra
 * Landazuri
 * Lincango
 */

public class TableModelF extends AbstractTableModel{
    private List<Personal> row;
    private String[] colName;
    private int[] cols;

    public TableModelF(List<Personal> row, int[] cols) {
        this.row = row;
        this.colName = new String[6];
        this.cols = cols;
        asigName();
    }
    
    @Override
    public int getRowCount() {
        return row.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Personal p = row.get(i);
        switch(cols[i1]){
            case 0:return p.getName();
            case 1:return p.getFatherLastName();
            case 2:return p.getMotherLastName();
            case 3:return p.getDocumentId();
            case 4:return p.getRol();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int i) {
        return colName[i];
    }

    private void asigName() {
        colName[0] = "Name";
        colName[1] = "Father Last Name";
        colName[2] = "Mother Last Name";
        colName[3] = "Document ID";
        colName[4] = "Funcion";
    }
    
    public Personal getRowAt(int x){
        return row.get(x);
    }
}
