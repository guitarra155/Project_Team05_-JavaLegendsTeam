package ec.edu.espe.MedicalPro.controller;

import ec.edu.espe.MedicalPro.view.medicalPro;
import ec.edu.espe.MedicalPro.controller.Personal;
import ec.edu.espe.MedicalPro.controller.Personal;
import ec.edu.espe.MedicalPro.model.ModelLog;
import ec.edu.espe.MedicalPro.model.ModelLog;
import ec.edu.espe.MedicalPro.view.ViewLoggin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 05 JavaLegends 
 * Insuasti
 * Guzman
 * Guitarra
 * Landazuri
 * Lincango
 */

public class ControlLoggin {
    private ec.edu.espe.MedicalPro.model.ModelLog model;
    private ViewLoggin view;

    public ControlLoggin(ModelLog model, ViewLoggin view) {
        this.model = model;
        this.view = view;
        this.view.setControl(this);
        this.view.setModel(model);
    }

    public void getAcceso(String usuario, String clave) {
        try {
            Personal f = ec.edu.espe.MedicalPro.model.ModelData.getInstance().getAcceso(usuario, clave);
            if(f != null){
                medicalPro.CONTROLP.arrancar(f);
                view.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            model.setFuntion(new Personal());
        }
    }

    public void init() {
        model.setFuntion(new Personal());
        view.setVisible(true);
    }

    public void fin() {
        view.dispose();
    }
    
}
