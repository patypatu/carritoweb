/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

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
public class EmpleadoIT {
    
    public EmpleadoIT() {
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
     * Test of getId method, of class Empleado.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Empleado.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Empleado instance = new Empleado();
        instance.setId(id);
    }

    /**
     * Test of setRut method, of class Empleado.
     */
    @Test
    public void testSetRut() {
        System.out.println("setRut");
        String rut = "";
        Empleado instance = new Empleado();
        instance.setRut(rut);
    }

    /**
     * Test of setNom method, of class Empleado.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Empleado instance = new Empleado();
        instance.setNombres(nom);
    }

    /**
     * Test of setTel method, of class Empleado.
     */
    @Test
    public void testSetTel() {
        System.out.println("setTel");
        String tel = "";
        Empleado instance = new Empleado();
        instance.setTelefono(tel);
    }

    /**
     * Test of setEstado method, of class Empleado.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Empleado instance = new Empleado();
        instance.setEstado(estado);
    }

    /**
     * Test of setUser method, of class Empleado.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        Empleado instance = new Empleado();
        instance.setUser(user);
    }
    
}
