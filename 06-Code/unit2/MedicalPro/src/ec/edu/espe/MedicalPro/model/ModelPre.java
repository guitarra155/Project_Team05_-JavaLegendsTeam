package ec.edu.espe.MedicalPro.model;

import ec.edu.espe.MedicalPro.controller.Personal;
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

public class ModelPre extends Observable{
    private Personal f;

    public ModelPre() {
        f = new Personal();
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
