/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import java.io.InputStream;
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
public class ProductoIT {
    
    public ProductoIT() {
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
     * Test of getId method, of class Producto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Producto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Producto instance = new Producto();
        instance.setId(id);
    }

    /**
     * Test of setNombres method, of class Producto.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Producto instance = new Producto();
        instance.setNombres(nombres);
    }

    /**
     * Test of getFoto method, of class Producto.
     */
    @Test
    public void testGetFoto() {
        System.out.println("getFoto");
        Producto instance = new Producto();
        InputStream expResult = null;
        InputStream result = instance.getFoto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFoto method, of class Producto.
     */
    @Test
    public void testSetFoto() {
        System.out.println("setFoto");
        InputStream foto = null;
        Producto instance = new Producto();
        instance.setFoto(foto);
    }

    /**
     * Test of setDescripcion method, of class Producto.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Producto instance = new Producto();
        instance.setDescripcion(descripcion);
    }

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Producto instance = new Producto();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Producto instance = new Producto();
        instance.setPrecio(precio);
    }

    /**
     * Test of getStock method, of class Producto.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStock method, of class Producto.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int stock = 0;
        Producto instance = new Producto();
        instance.setStock(stock);
    }
    
}
