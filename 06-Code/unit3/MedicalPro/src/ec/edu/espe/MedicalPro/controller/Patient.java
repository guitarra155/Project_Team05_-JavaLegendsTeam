package ec.edu.espe.MedicalPro.controller;

import com.mongodb.client.MongoCollection;
import java.io.BufferedReader;
import java.io.PrintWriter;
import org.bson.Document;
import utils.Connection;

/**
 *
 * @author Grupo 05 JavaLegends 
 * Insuasti
 * Guzman
 * Guitarra
 * Landazuri
 * Lincango
 */

public class Patient {

    private String Name;
    private String FatherLastName;
    private String MotherLastName;
    private String DocumentId;
    private String Date;
    private String Diagnosis;

    public Patient(String name, String fatherLastName, String motherLastName, String DocumentId, String Date, String Diagnosis) {
        this.Name = name;
        this.FatherLastName = fatherLastName;
        this.MotherLastName = motherLastName;
        this.DocumentId = DocumentId;
        this.Date = Date;
        this.Diagnosis = Diagnosis;
    }

    public Patient() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFatherLastName() {
        return FatherLastName;
    }

    public void setFatherLastName(String FatherLastName) {
        this.FatherLastName = FatherLastName;
    }

    public String getMotherLastName() {
        return MotherLastName;
    }

    public void setMotherLastName(String MotherLastName) {
        this.MotherLastName = MotherLastName;
    }

    public String getDocumentId() {
        return DocumentId;
    }

    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    public void guardar(PrintWriter escribe) {
        escribe.println(Name);
        escribe.println(FatherLastName);
        escribe.println(MotherLastName);
        escribe.println(DocumentId);
        escribe.println(Date);
        escribe.println(Diagnosis);
    }

    public Patient cargarDatos(BufferedReader almacen) {
        String name;
        String fatherLastName;
        String motherLastName;
        String documentId;
        String date;
        String diagnosis;
        try {
            name = almacen.readLine();
            fatherLastName = almacen.readLine();
            motherLastName = almacen.readLine();
            documentId = almacen.readLine();
            date = almacen.readLine();
            diagnosis = almacen.readLine();
            if (name == null) {
                return null;
            } else {
                return new Patient(name, fatherLastName, motherLastName, documentId, date, diagnosis);
            }
        } catch (Exception e) {
            return null;
        }
    }
    public static void createPatient(String name, String fatherLastName, String motherLastName, String DocumentId, String Date, String Diagnosis){
        MongoCollection<Document> Patients = new Connection().obtenerDB().getCollection("Patients");
        Document documento = new Document();
        
        documento.put("Name", name);
        documento.put("Father LastName", fatherLastName);
        documento.put("Mother LastName",motherLastName);
        documento.put("DocumentId",DocumentId);
        documento.put("Date", Date);
        documento.put("Diagnosis", Diagnosis);
        
        Patients.insertOne(documento);       
    }
}
