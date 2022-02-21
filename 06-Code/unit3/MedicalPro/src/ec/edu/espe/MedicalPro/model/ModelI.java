package ec.edu.espe.MedicalPro.model;

import ec.edu.espe.MedicalPro.controller.Patient;
import ec.edu.espe.MedicalPro.controller.TableModelI;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Grupo 05 JavaLegends 
 * Insuasti
 * Guzman
 * Guitarra
 * Landazuri
 * Lincango
 */

public class ModelI extends Observable{

    private boolean columns;
    private Patient patient;
    private List<Patient> row;
    private int[] col = {0,1,2,3,4,5};
    private TableModelI table;
    
    public ModelI() {
        columns = false;
        row = new ArrayList<>();
        patient = new Patient();
        table = new TableModelI(row, col);
    }

    public boolean isColumns() {
        return columns;
    }

    public void setColumns(boolean columns) {
        this.columns = columns;
    }

    public List<Patient> getRow() {
        return row;
    }

    public void setRow(List<Patient> ro) {
        table = new TableModelI(ro, col);
        refresh();
    }

    public TableModelI getTable() {
        return table;
    }

    public void setTable(TableModelI table) {
        this.table = table;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
        refresh();
    }
    
    
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        refresh();
    }
    
    private void refresh(){
        setChanged();
        notifyObservers();
    }


    
}
