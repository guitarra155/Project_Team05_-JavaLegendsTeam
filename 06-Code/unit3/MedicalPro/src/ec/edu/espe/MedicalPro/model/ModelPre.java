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
    private Personal function;

    public ModelPre() {
        function = new Personal();
    }

    public Personal getFunction() {
        return function;
    }

    public void setFunction(Personal function) {
        this.function = function;
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
