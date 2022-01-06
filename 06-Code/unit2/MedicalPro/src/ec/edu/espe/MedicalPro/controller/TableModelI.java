package ec.edu.espe.MedicalPro.controller;

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

public class TableModelI extends AbstractTableModel{

    private List<Patient> row;
    private String[] colName;
    private int[] cols;

    public TableModelI(List<Patient> row, int[] cols) {
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
        Patient p = row.get(i);
        switch(cols[i1]){
            case 0:return p.getNombre();
            case 1:return p.getApellido1();
            case 2:return p.getApellido2();
            case 3:return p.getCedula();
            case 4:return p.getPatologia();
            case 5:return p.getFecha();
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
        colName[4] = "Diagnosis";
        colName[5] = "Date of Admission";
    }
    
    public Patient getRowAt(int x){
        return row.get(x);
    }
}
