/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import modelo.Producto;

/**
 *
 * @author docencia
 */
public class ProductoDAO {
    private static final Logger LOGGER = Logger.getLogger(ProductoDAO.class.getName());
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    
    public Producto buscar(int id) {
        String sql = "select * from producto where idProducto=?";
        Producto p = new Producto();
        
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           rs = ps.executeQuery();
           while (rs.next()){
               p.setId(rs.getInt(1));
               p.setNombres(rs.getString(2));
               p.setFoto(rs.getBinaryStream(3));
               p.setDescripcion(rs.getString(4));
               p.setPrecio(rs.getDouble(5));
               p.setStock(rs.getInt(6));
               
           }
        }catch(Exception e) {
            LOGGER.severe("Error al buscar producto"+e);
        }
        return p;
    }
    
    public int actualizarStock(int id, int stock) {
        String sql = "update producto set stock =? where idProducto = ?";
        try {
            con =cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            ps.executeUpdate();
        }catch(Exception e) {
            LOGGER.severe("Error al actualizar stock del producto"+e); 
        }
        return r;
    }
    
    public Producto listarId(int id){
        return buscar(id);
    }
    
    public List<Producto> listar() {
        List<Producto>productos = new ArrayList<>();
        String sql = "select * from producto";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); 
            while(rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombres(rs.getString(2));
                p.setFoto(rs.getBinaryStream(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getDouble(5));
                p.setStock(rs.getInt(6));
                productos.add(p);
            }
            
        } catch(Exception e){
            LOGGER.severe("Error al listar productos"+e);
        }
        return productos;
    }
    
    public void listarImg(int id, HttpServletResponse response) {
        String sql = "select * from producto where idProducto = ?" ;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            outputStream = response.getOutputStream();
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            if(rs.next()) {
                inputStream = rs.getBinaryStream("Foto");
                
            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int i = 0;
            while((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
        }catch(Exception e) {
            
            LOGGER.severe("Error al listar imagen del producto"+e);
        }
        
    }
    
    public int agregar(Producto p){ 
        String sql="insert into producto(Nombres, Descripcion, Precio, Stock)values(?,?,?,?)";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            r = ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.severe("Error al agregar producto"+e);
        }
        return r;
        
    }
    
    public int actualizar(Producto p){
        String sql="update producto set Nombres=?, Descripcion=?, Precio=?, Stock=? where idProducto=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.setInt(5, p.getId());
            r = ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.severe("Error al actualizar producto"+e);
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from producto where IdProducto=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.severe("Error al eliminar producto"+e);
        }
    }
    
}
