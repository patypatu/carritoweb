/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
public class ProductoDAOIT {
    
    public ProductoDAOIT() {
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
     * Test of actualizarStock method, of class ProductoDAO.
     */
    @Test
    public void testActualizarStock() {
        System.out.println("actualizarStock");
        int id = 0;
        int stock = 0;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.actualizarStock(id, stock);
        assertEquals(expResult, result);
    }

    /**
     * Test of listarImg method, of class ProductoDAO.
     */
    @Test
    public void testListarImg() {
        System.out.println("listarImg");
        int id = 0;
        HttpServletResponse response = null;
        ProductoDAO instance = new ProductoDAO();
        instance.listarImg(id, response);
    }

    /**
     * Test of agregar method, of class ProductoDAO.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Producto p = null;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.agregar(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class ProductoDAO.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Producto p = null;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.actualizar(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class ProductoDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        ProductoDAO instance = new ProductoDAO();
        instance.delete(id);
    }
    
}
