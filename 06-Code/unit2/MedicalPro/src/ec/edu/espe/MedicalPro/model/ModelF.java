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
    private boolean edit;
    private Personal funtion;
    private TableModelF columns;
    private int[] cols = {0,1,2,3,4};

    public ModelF() {
        edit = false;
        row = new ArrayList<>();
        funtion = new Personal();
        columns = new TableModelF(row, cols);
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public TableModelF getColumns() {
        return columns;
    }

    public List<Personal> getRow() {
        return row;
    }

    public void setRow(List<Personal> r) {
        columns = new TableModelF(r, cols);
        refresh();
    }

    public Personal getFuntion() {
        return funtion;
    }

    public void setFuntion(Personal funtion) {
        this.funtion = funtion;
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
