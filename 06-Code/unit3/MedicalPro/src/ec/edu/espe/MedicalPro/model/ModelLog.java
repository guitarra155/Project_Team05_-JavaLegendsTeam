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

public class ModelLog extends Observable{
    private Personal funtion;

    public ModelLog() {
        funtion = new Personal();
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
