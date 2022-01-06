package ec.edu.espe.MedicalPro.controller;

import ec.edu.espe.MedicalPro.model.ModelI;
import ec.edu.espe.MedicalPro.model.ModelI;
import ec.edu.espe.MedicalPro.view.ViewPatient;
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

public class ControlPatient {
    private ModelI model;
    private ViewPatient view;
    public ControlPatient(ModelI model, ViewPatient view) {
        this.model = model;
        this.view = view;
        this.view.setControl(this);
        this.view.setModel(model);
    }

    public void init() {
        view.setVisible(true);
    }

    public void agregar(boolean b, String nom, String ape1, String ape2, String ced, String pato, String fe) {
        try {
            Patient p = new Patient(nom, ape1, ape2, ced, fe, pato);
            if(!b){
                ec.edu.espe.MedicalPro.model.ModelData.getInstance().addPaciente(p);
            }else{
                ec.edu.espe.MedicalPro.model.ModelData.getInstance().modificarPaciente(p);
            }
            solTodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        model.setPatient(new Patient());
        model.setColumns(false);
    }

    public void cancelar() {
        model.setPatient(new Patient());
    }

    public void buscarPaciente(String b) {
        try {
            List<Patient> row = ec.edu.espe.MedicalPro.model.ModelData.getInstance().getPaciente(b);
            model.setRow(row);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void solTodos() {
        List<Patient> row = ec.edu.espe.MedicalPro.model.ModelData.getInstance().getPacientes();
        model.setRow(row);
    }

    public void editar() {
        model.setColumns(true);
    }

    public void recuperarEditable(int row) {
        Patient p = model.getTable().getRowAt(row);
        model.setPatient(p);
    }

    public void eliminar(int x) {
        Patient p = model.getTable().getRowAt(x);
        ec.edu.espe.MedicalPro.model.ModelData.getInstance().eliminarPaciente(p);
        List<Patient> row = ec.edu.espe.MedicalPro.model.ModelData.getInstance().getPacientes();
        model.setRow(row);
    }

    public void close() {
        view.dispose();
    }
}
