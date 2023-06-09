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
public class CarritoIT {
    
    public CarritoIT() {
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
     * Test of getItem method, of class Carrito.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Carrito instance = new Carrito();
        int expResult = 0;
        int result = instance.getItem();
        assertEquals(expResult, result);

    }

    /**
     * Test of setItem method, of class Carrito.
     */
    @Test
    public void testSetItem() {
        System.out.println("setItem");
        int item = 0;
        Carrito instance = new Carrito();
        instance.setItem(item);
    }

    /**
     * Test of getIdProducto method, of class Carrito.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        Carrito instance = new Carrito();
        int expResult = 0;
        int result = instance.getIdProducto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdProducto method, of class Carrito.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        int idProducto = 0;
        Carrito instance = new Carrito();
        instance.setIdProducto(idProducto);
    }

    /**
     * Test of setNombres method, of class Carrito.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Carrito instance = new Carrito();
        instance.setNombres(nombres);
    }

    /**
     * Test of setDescripcion method, of class Carrito.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "test";
        Carrito instance = new Carrito();
        instance.setDescripcion(descripcion);
    }

    /**
     * Test of getPrecioCompra method, of class Carrito.
     */
    @Test
    public void testGetPrecioCompra() {
        System.out.println("getPrecioCompra");
        Carrito instance = new Carrito();
        double expResult = 0.0;
        double result = instance.getPrecioCompra();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPrecioCompra method, of class Carrito.
     */
    @Test
    public void testSetPrecioCompra() {
        System.out.println("setPrecioCompra");
        double precioCompra = 0.0;
        Carrito instance = new Carrito();
        instance.setPrecioCompra(precioCompra);
    }

    /**
     * Test of setCantidad method, of class Carrito.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Carrito instance = new Carrito();
        instance.setCantidad(cantidad);
    }

    /**
     * Test of getSubTotal method, of class Carrito.
     */
    @Test
    public void testGetSubTotal() {
        System.out.println("getSubTotal");
        Carrito instance = new Carrito();
        double expResult = 0.0;
        double result = instance.getSubTotal();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setSubTotal method, of class Carrito.
     */
    @Test
    public void testSetSubTotal() {
        System.out.println("setSubTotal");
        double subTotal = 0.0;
        Carrito instance = new Carrito();
        instance.setSubTotal(subTotal);
    }
    
}
