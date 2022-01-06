package ec.edu.espe.MedicalPro.controller;

import ec.edu.espe.MedicalPro.view.Principal;
import ec.edu.espe.MedicalPro.controller.Personal;
import ec.edu.espe.MedicalPro.controller.Personal;
import ec.edu.espe.MedicalPro.model.ModelPre;
import ec.edu.espe.MedicalPro.model.ModelPre;
import ec.edu.espe.MedicalPro.view.ViewMenu;

/**
 *
 * @author Grupo 05 JavaLegends 
 * Insuasti
 * Guzman
 * Guitarra
 * Landazuri
 * Lincango
 */

public class ControlMenu {
    private ModelPre model;
    private ViewMenu view;
    public ControlMenu(ModelPre model, ViewMenu view) {
        this.model = model;
        this.view = view;
        this.view.setControl(this);
        this.view.setModel(model);
    }

    public void arrancar(Personal f) {
        model.setFunction(f);
        view.setVisible(true);
    }

    public void reabrir() {
        view.dispose();
        Principal.CONTROLLOGIN.init();
    }

    public void initInternos() {
        Principal.CONTROLI.init();
    }

    private void close() {
        view.dispose();
    }
}
