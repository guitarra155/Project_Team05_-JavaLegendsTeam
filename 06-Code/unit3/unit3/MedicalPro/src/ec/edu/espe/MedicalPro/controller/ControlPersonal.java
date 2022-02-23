package ec.edu.espe.MedicalPro.controller;

import ec.edu.espe.MedicalPro.controller.Personal;
import ec.edu.espe.MedicalPro.controller.Personal;
import ec.edu.espe.MedicalPro.model.ModelF;
import ec.edu.espe.MedicalPro.model.ModelF;
import ec.edu.espe.MedicalPro.view.ViewPersonal;
import java.util.List;
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

public class ControlPersonal {
    private ModelF model;
    private ViewPersonal view;
    public ControlPersonal(ModelF model, ViewPersonal view) {
        this.model = model;
        this.view = view;
        this.view.setControl(this);
        this.view.setModel(model);
    }

    public void add(boolean b, String nom, String ape1, String ape2, String ced, int rol, String user, String pass) {
        try {
            Personal f = new Personal(nom, ape1, ape2, ced, rol, user, pass);
            if(!b){
                ec.edu.espe.MedicalPro.model.ModelData.getInstance().addFuncionario(f);
            }else{
                ec.edu.espe.MedicalPro.model.ModelData.getInstance().modificarFuncionario(f);
            }
            solTodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        model.setFuntion(new Personal());
        model.setEdit(false);
    }
    
    public void solTodos() {
        List<Personal> row = ec.edu.espe.MedicalPro.model.ModelData.getInstance().getFuncionarios();
        model.setRow(row);
    }
    
    public void eddit() {
        model.setEdit(true);
    }
    
    public void searchPersonal(String b) {
        try {
            List<Personal> row = ec.edu.espe.MedicalPro.model.ModelData.getInstance().getFuncionario(b);
            model.setRow(row);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void recoverEditable(int row) {
        Personal p = model.getColumns().getRowAt(row);
        model.setFuntion(p);
    }
    
    public void delete(int x) {
        Personal p = model.getColumns().getRowAt(x);
        ec.edu.espe.MedicalPro.model.ModelData.getInstance().eliminarFuncionario(p);
        List<Personal> row = ec.edu.espe.MedicalPro.model.ModelData.getInstance().getFuncionarios();
        model.setRow(row);
    }
    
    public void cancel() {
        model.setFuntion(new Personal());
    }
    
    public void init() {
        view.setVisible(true);
    }

    public void close() {
        view.dispose();
    }
}
