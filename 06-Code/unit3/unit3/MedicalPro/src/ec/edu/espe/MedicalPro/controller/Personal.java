package ec.edu.espe.MedicalPro.controller;



import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import java.io.BufferedReader;
import java.io.PrintWriter;
import org.bson.Document;
import org.bson.types.ObjectId;
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

public class Personal {

    private String name;
    private String FatherLastName;
    private String MotherLastName;
    private String documentId;
    private int rol;
    private String password;
    private String username;

    public Personal(String Name, String fatherLastName, String motherLastName, String DocumentId, int rol, String Password, String Username) {
        this.name = Name;
        this.FatherLastName = fatherLastName;
        this.MotherLastName = motherLastName;
        this.documentId = DocumentId;
        this.rol = rol;
        this.password = Password;
        this.username = Username;
    }

    public Personal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void guardar(PrintWriter escribe) {
        escribe.println(name);
        escribe.println(FatherLastName);
        escribe.println(MotherLastName);
        escribe.println(documentId);
        escribe.println(rol);
        escribe.println(password);
        escribe.println(username);
    }

    public Personal cargarDatos(BufferedReader almacen) {
        String name;
        String fatherLastName;
        String motherLastName;
        String documentId;
        int rol;
        String password;
        String username;

        try {
            name = almacen.readLine();
            fatherLastName = almacen.readLine();
            motherLastName = almacen.readLine();
            documentId = almacen.readLine();
            rol = Integer.parseInt(almacen.readLine());
            password = almacen.readLine();
            username = almacen.readLine();
            if (name == null) {
                return null;
            } else {
                return new Personal(name, fatherLastName, motherLastName, documentId, rol, password, username);
            }

        } catch (Exception e) {
            return null;
        }
    }
    public static void createPersonal(String Name, String fatherLastName, String motherLastName, String DocumentId, int rol, String Password, String Username){
        MongoCollection<Document> Personal = new Connection().obtenerDB().getCollection("Personal");
        Document documento = new Document();
        
        documento.put("Name", Name);
        documento.put("Father LastName", fatherLastName);
        documento.put("Mother LastName",motherLastName);
        documento.put("DocumentId",DocumentId);
        documento.put("Date", rol);
        documento.put("Password", Password);
        documento.put("Username", Username);
        
        Personal.insertOne(documento);
    }
    public static boolean deletePersonal(String id){
        MongoCollection<Document> Personal = new Connection().obtenerDB().getCollection("Personal");
        DeleteResult answer = Personal.deleteOne(new Document("_id", new ObjectId(id)));
        return true;
    }
}
