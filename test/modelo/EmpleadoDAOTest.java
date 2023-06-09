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
 * @author nicep
 */
public class EmpleadoDAOTest {
    
    public EmpleadoDAOTest() {
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
     * Test of validar method, of class EmpleadoDAO.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        String user = "";
        String rut = "";
        EmpleadoDAO instance = new EmpleadoDAO();
        Empleado expResult = null;
        Empleado result = instance.validar(user, rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class EmpleadoDAO.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        EmpleadoDAO instance = new EmpleadoDAO();
        List<Empleado> expResult = null;
        List<Empleado> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarId method, of class EmpleadoDAO.
     */
    @Test
    public void testListarId() {
        System.out.println("listarId");
        int id = 0;
        EmpleadoDAO instance = new EmpleadoDAO();
        Empleado expResult = null;
        Empleado result = instance.listarId(id);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
