package ec.edu.espe.MedicalPro.view;

import ec.edu.espe.MedicalPro.controller.ControlPersonal;
import ec.edu.espe.MedicalPro.controller.ControlPatient;
import ec.edu.espe.MedicalPro.controller.ControlLoggin;
import ec.edu.espe.MedicalPro.controller.ControlMenu;
import ec.edu.espe.MedicalPro.model.ModelF;
import ec.edu.espe.MedicalPro.model.ModelI;
import ec.edu.espe.MedicalPro.model.ModelPre;
import ec.edu.espe.MedicalPro.model.ModelLog;

/**
 *
 * @author Grupo 05 JavaLegends 
 * Insuasti
 * Guzman
 * Guitarra
 * Landazuri
 * Lincango
 */

public class medicalPro {
    public static void main(String[] arg){

        ec.edu.espe.MedicalPro.model.ModelData.getInstance().cargar();
        
        ec.edu.espe.MedicalPro.view.ViewLoggin v1 = new ViewLoggin();
        ec.edu.espe.MedicalPro.model.ModelLog m1 = new ModelLog();
        ec.edu.espe.MedicalPro.controller.ControlLoggin c1 = new ControlLoggin(m1, v1);
        v1.setVisible(true);
        CONTROLLOGIN = c1;
        
        ec.edu.espe.MedicalPro.view.ViewPersonal v3 = new ViewPersonal();
        ec.edu.espe.MedicalPro.model.ModelF m3 = new ModelF();
        ec.edu.espe.MedicalPro.controller.ControlPersonal c3 = new ControlPersonal(m3, v3);
        CONTROLF = c3;
        
        ec.edu.espe.MedicalPro.view.ViewPatient v4 = new ViewPatient();
        ec.edu.espe.MedicalPro.model.ModelI m4 = new ModelI();
        ec.edu.espe.MedicalPro.controller.ControlPatient c4 = new ControlPatient(m4, v4);
        CONTROLI = c4;
        
        ec.edu.espe.MedicalPro.view.ViewMenu v2 = new ViewMenu();
        ec.edu.espe.MedicalPro.model.ModelPre m2 = new ModelPre();
        ec.edu.espe.MedicalPro.controller.ControlMenu c2 = new ControlMenu(m2, v2);
        v2.addInternalFrame(v3);
        v2.addInternalFrame(v4);
        CONTROLP = c2;
    }
    public static ec.edu.espe.MedicalPro.controller.ControlLoggin CONTROLLOGIN;
    public static ec.edu.espe.MedicalPro.controller.ControlMenu CONTROLP;
    public static ec.edu.espe.MedicalPro.controller.ControlPersonal CONTROLF;
    public static ec.edu.espe.MedicalPro.controller.ControlPatient CONTROLI;
}
