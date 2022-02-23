/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.MedicalPro.Bill;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Guzman
 */
public class BillOperationTest {
    
    public BillOperationTest() {
    }

    /**
     * Test of add method, of class BillOperation.
     */
    @Test
    public void testAdd() {        
        float value = 10.0F;
        BillOperation instance = new BillOperation();
        float expResult = 11.2F;
        float result = instance.add(value);
        assertEquals(expResult, result, 0.0); 
    }
    @Test
    public void testAddTicket() {        
        float value = 5.75F;
        BillOperation instance = new BillOperation();
        float expResult = 6.44F;
        float result = instance.add(value);
        assertEquals(expResult, result, 0.0); 
    }
    @Test
    public void testAddOperation() {        
        float value = 3477.56F;
        BillOperation instance = new BillOperation();
        float expResult = 3894.8672F;
        float result = instance.add(value);
        assertEquals(expResult, result, 0.0); 
    }
    @Test
    public void testAddParking() {        
        float value = 0.50F;
        BillOperation instance = new BillOperation();
        float expResult = 0.56F;
        float result = instance.add(value);
        assertEquals(expResult, result, 0.0); 
    }
    @Test
    public void testAddMedicine() {        
        float value = 8.0F;
        BillOperation instance = new BillOperation();
        float expResult = 8.96F;
        float result = instance.add(value);
        assertEquals(expResult, result, 0.0); 
    }
    @Test
    public void testAddConsultation() {        
        float value = 35.0F;
        BillOperation instance = new BillOperation();
        float expResult = 39.2F;
        float result = instance.add(value);
        assertEquals(expResult, result, 0.0); 
    }
    @Test
    public void testAddDoctor() {        
        float value = 62.0F;
        BillOperation instance = new BillOperation();
        float expResult = 69.44F;
        float result = instance.add(value);
        assertEquals(expResult, result, 0.0); 
    }
    @Test
    public void testAddHospitalitation() {        
        float value = 100.0F;
        BillOperation instance = new BillOperation();
        float expResult = 112.0F;
        float result = instance.add(value);
        assertEquals(expResult, result, 0.0); 
    }
    @Test
    public void testAddClinic() {        
        float value = 1000.0F;
        BillOperation instance = new BillOperation();
        float expResult = 1120.0F;
        float result = instance.add(value);
        assertEquals(expResult, result, 0.0); 
    }
    
    
}
