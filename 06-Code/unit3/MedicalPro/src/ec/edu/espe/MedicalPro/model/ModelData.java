package ec.edu.espe.MedicalPro.model;

import ec.edu.espe.MedicalPro.controller.Patient;
import ec.edu.espe.MedicalPro.controller.Personal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Grupo 05 JavaLegends 
 * Insuasti
 * Guzman
 * Guitarra
 * Landazuri
 * Lincango
 */

public class ModelData {
    private static ModelData instances = null;
    private Map<String, Personal> personal;
    private Map<String, Patient> patient;

    private ModelData() {
        personal = new HashMap<>();
        patient = new HashMap<>();
    }
    
    public void addPaciente(Patient p) throws Exception {
        if(patient.get(p.getDocumentId()) == null){
            patient.put(p.getDocumentId(), p);
        }else{
            throw new Exception("Patient already exists");
        }
    }
    public static ModelData getInstance(){
        if(instances == null){
            instances = new ModelData();
        }
        return instances;
    }
    
    public void guardar(){
        guardarFuncionarios();
        guardarPacientes();
    }
    
    public void cargar(){
        cargaFuncionarios();
        cargaPacientes();
    }
    
    public Personal getAcceso(String usuario, String clave) throws Exception {
        for (Map.Entry<String, Personal> entry : personal.entrySet()) {
            Personal f = entry.getValue();
            if(f.getPassword().equals(clave) && f.getUsername().equals(usuario)){
                return f;
            }
            
        }
        throw new Exception("There is no registered Official");
    }
    
    private void cargaPacientes(){
        File file = new File("Pacientes.txt");
        FileReader leer;
        BufferedReader almacen;
        Patient aux;
        Patient per = new Patient();
        try {
            leer = new FileReader(file);
            almacen = new BufferedReader(leer);
            aux = per.cargarDatos(almacen);
            while(aux != null){
                patient.put(aux.getDocumentId(), aux);
                aux = per.cargarDatos(almacen);
            }
            leer.close();
            almacen.close();            
        } catch (Exception e) {
        }
    }
    
    private void cargaFuncionarios(){
        File file = new File("Funcionarios.txt");
        FileReader leer;
        BufferedReader almacen;
        Personal aux;
        Personal per = new Personal();
        try {
            leer = new FileReader(file);
            almacen = new BufferedReader(leer);
            aux = per.cargarDatos(almacen);
            while(aux != null){
                personal.put(aux.getDocumentId(), aux);
                aux = per.cargarDatos(almacen);
            }
            leer.close();
            almacen.close();
        } catch (Exception e) {
        }
    }
    
    private void guardarPacientes(){
        File archivo = new File("Pacientes.txt");
        PrintWriter escribe;
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            escribe = new PrintWriter(archivo, "utf-8");
            for (Map.Entry<String, Patient> entry : patient.entrySet()) {
                entry.getValue().guardar(escribe);
                
            }
            escribe.close();
        } catch (Exception e) {
        }
    }
    
    private void guardarFuncionarios(){
        File archivo = new File("Funcionarios.txt");
        PrintWriter escribe;
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            escribe = new PrintWriter(archivo, "utf-8");
            for (Map.Entry<String, Personal> entry : personal.entrySet()) {
                entry.getValue().guardar(escribe);
                
            }
            escribe.close();
        } catch (Exception e) {
        }
    }

    public List<Patient> getPacientes() {
        List<Patient> lis = new ArrayList<>();
        for (Map.Entry<String, Patient> entry : patient.entrySet()) {
            lis.add(entry.getValue());
            
        }
        return lis;
    }

    public List<Patient> getPaciente(String b) throws Exception{
        List<Patient> p = new ArrayList<>();
        Patient x = patient.get(b);
        if(x != null){
            p.add(x);
            return p;
        }
        throw new Exception("There is no patient with that ID");
    }

    public void modificarPaciente(Patient p) {
        Patient pa = patient.get(p.getDocumentId());
        if(pa != null){
            pa.setName(p.getName());
            pa.setFatherLastName(p.getFatherLastName());
            pa.setMotherLastName(p.getMotherLastName());
            pa.setDate(p.getDate());
            pa.setDiagnosis(p.getDiagnosis());
        }
    }

    public void eliminarPaciente(Patient p) {
        patient.remove(p.getDocumentId());
    }

    public void addFuncionario(Personal f) throws Exception {
        if(personal.get(f.getDocumentId()) == null){
            personal.put(f.getDocumentId(), f);
        }else{
            throw new Exception("Official already exists");
        }
    }

    public void modificarFuncionario(Personal f) {
        Personal pa = personal.get(f.getDocumentId());
        if(pa != null){
            pa.setName(f.getName());
            pa.setFatherLastName(f.getFatherLastName());
            pa.setMotherLastName(f.getMotherLastName());
            pa.setPassword(f.getPassword());
            pa.setUsername(f.getUsername());
            pa.setRol(f.getRol());
        }
    }

    public List<Personal> getFuncionarios() {
        List<Personal> lis = new ArrayList<>();
        for (Map.Entry<String, Personal> entry : personal.entrySet()) {
            lis.add(entry.getValue());
            
        }
        return lis;
    }

    public List<Personal> getFuncionario(String b) throws Exception {
        List<Personal> p = new ArrayList<>();
        Personal x = personal.get(b);
        if(x != null){
            p.add(x);
            return p;
        }
        throw new Exception("There is no Official with that ID");
    }

    public void eliminarFuncionario(Personal p) {
        personal.remove(p.getDocumentId());
    }
}
