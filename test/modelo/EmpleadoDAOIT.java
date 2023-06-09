/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import dao.EmpleadoDAO;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo
 */
public class EmpleadoDAOIT {
    
    public EmpleadoDAOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregar method, of class EmpleadoDAO.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Empleado em = null;
        EmpleadoDAO instance = new EmpleadoDAO();
        int expResult = 0;
        int result = instance.agregar(em);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class EmpleadoDAO.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Empleado em = null;
        EmpleadoDAO instance = new EmpleadoDAO();
        int expResult = 0;
        int result = instance.actualizar(em);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class EmpleadoDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        EmpleadoDAO instance = new EmpleadoDAO();
        instance.delete(id);
    }
    
}
