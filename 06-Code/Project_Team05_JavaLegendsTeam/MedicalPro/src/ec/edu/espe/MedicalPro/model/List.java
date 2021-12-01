/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author mateo
 */
public class List {
    
    private String name;
    private String diseases;
    private int number;
    private String signature;
    private String conditions;
    
    @Override
    public String toString() {
        return "List{" + "name=" + name + ", diseases=" + diseases + ", number=" + number + ", signature=" + signature + ", conditions=" + conditions + '}';
    }

    public List(String name, String diseases, int number, String signature, String conditions) {
        this.name = name;
        this.diseases = diseases;
        this.number = number;
        this.signature = signature;
        this.conditions = conditions;
    }
    
    private void searchDoctor (){
    }
    private void searchPatient (){
    }
    private void orderData(){
    }

    public String getName() {
        return name;
    }

    public String getDiseases() {
        return diseases;
    }

    public int getNumber() {
        return number;
    }

    public String getSignature() {
        return signature;
    }

    public String getConditions() {
        return conditions;
    }
   
}
