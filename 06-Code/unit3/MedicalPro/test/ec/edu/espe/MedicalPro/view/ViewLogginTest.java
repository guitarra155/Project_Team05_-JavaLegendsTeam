/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.MedicalPro.view;

import ec.edu.espe.MedicalPro.controller.ControlLoggin;
import ec.edu.espe.MedicalPro.model.ModelLog;
import java.util.Observable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mateo Landazuri
 */
public class ViewLogginTest {
    
    public ViewLogginTest() {
    }

    /**
     * Test of getModel method, of class ViewLoggin.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        ViewLoggin instance = new ViewLoggin();
        ModelLog expResult = null;
        ModelLog result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getControl method, of class ViewLoggin.
     */
    @Test
    public void testGetControl() {
        System.out.println("getControl");
        ViewLoggin instance = new ViewLoggin();
        ControlLoggin expResult = null;
        ControlLoggin result = instance.getControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setControl method, of class ViewLoggin.
     */
    @Test
    public void testSetControl() {
        System.out.println("setControl");
        ControlLoggin control = null;
        ViewLoggin instance = new ViewLoggin();
        instance.setControl(control);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class ViewLoggin.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        ModelLog model = null;
        ViewLoggin instance = new ViewLoggin();
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ViewLoggin.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable o = null;
        Object o1 = null;
        ViewLoggin instance = new ViewLoggin();
        instance.update(o, o1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
