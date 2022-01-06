package ec.edu.espe.MedicalPro.model;

import ec.edu.espe.MedicalPro.controller.TableModelF;
import ec.edu.espe.MedicalPro.controller.Personal;
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

public class ModelF extends Observable{
    private List<Personal> row;
    private boolean editar;
    private Personal f;
    private TableModelF tablita;
    private int[] cols = {0,1,2,3,4};

    public ModelF() {
        editar = false;
        row = new ArrayList<>();
        f = new Personal();
        tablita = new TableModelF(row, cols);
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public TableModelF getTablita() {
        return tablita;
    }

    public List<Personal> getRow() {
        return row;
    }

    public void setRow(List<Personal> r) {
        tablita = new TableModelF(r, cols);
        refresh();
    }

    public Personal getF() {
        return f;
    }

    public void setF(Personal f) {
        this.f = f;
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
