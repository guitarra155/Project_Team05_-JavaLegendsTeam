/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MedicalPro.Bill;

/**
 *
 * @author Jose Guzman
 */
public class BillOperation {
    public float add(float value){
        
        float iva= (float) (value*0.12);
        float bill;
        bill=value+iva;
        return bill;
    }
}
