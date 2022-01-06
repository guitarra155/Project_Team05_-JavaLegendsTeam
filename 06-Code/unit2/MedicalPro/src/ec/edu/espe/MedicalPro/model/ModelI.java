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

    private boolean editar;
    private Patient p;
    private List<Patient> row;
    private int[] col = {0,1,2,3,4,5};
    private TableModelI tabla;
    
    public ModelI() {
        editar = false;
        row = new ArrayList<>();
        p = new Patient();
        tabla = new TableModelI(row, col);
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public List<Patient> getRow() {
        return row;
    }

    public void setRow(List<Patient> ro) {
        tabla = new TableModelI(ro, col);
        refresh();
    }

    public TableModelI getTabla() {
        return tabla;
    }

    public void setTabla(TableModelI tabla) {
        this.tabla = tabla;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
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
