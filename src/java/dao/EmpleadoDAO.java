package dao;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import modelo.Empleado;

public class EmpleadoDAO {
    private static final Logger LOGGER = Logger.getLogger(EmpleadoDAO.class.getName());
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Empleado validar(String user, String rut) {
        Empleado em = new Empleado();
        String sql = "select * from empleado where User=? and Rut=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, rut);
            rs = ps.executeQuery();
            while (rs.next()) {
                em.setId(rs.getInt("IdEmpleado"));
                em.setUser(rs.getString("User"));
                em.setRut(rs.getString("Rut"));
                em.setNom(rs.getString("Nombres"));
            }
        } catch (Exception e) {
            LOGGER.severe("Error validar empleado"+e);
        }
        return em;
    }
    
    //Operaciones CRUD
    
    public List<Empleado> listar(){
        String sql="select * from empleado";
        List<Empleado>lista=new ArrayList<>();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Empleado em=new Empleado();
                em.setId(rs.getInt(1));
                em.setRut(rs.getString(2));
                em.setNom(rs.getString(3));
                em.setTel(rs.getString(4));
                em.setEstado(rs.getString(5));
                em.setUser(rs.getString(6));
                lista.add(em);
            }
        } catch (Exception e) {
            LOGGER.severe("Error al listar empleados"+e);
        }
        return lista;
    }
    public int agregar(Empleado em){ 
        String sql="insert into empleado(Rut, Nombres, Telefono,Estado,User)values(?,?,?,?,?)";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getRut());
            ps.setString(2, em.getNom());
            ps.setString(3, em.getTel());
            ps.setString(4, em.getEstado());
            ps.setString(5, em.getUser());
            ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.severe("Error al agregar empleado"+e);
        }
        return r;
        
    }
    public Empleado listarId(int id){
        Empleado emp=new Empleado();
        String sql="select * from empleado where IdEmpleado=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, String.valueOf(id));
            rs=ps.executeQuery();
            while (rs.next()) {
                emp.setRut(rs.getString(2));
                emp.setNom(rs.getString(3));
                emp.setTel(rs.getString(4));
                emp.setEstado(rs.getString(5));
                emp.setUser(rs.getString(6));
            }
        } catch (Exception e) {
            LOGGER.severe("Error al listar id de empleado"+e);
        }
        return emp;
    }
    public int actualizar(Empleado em){
        String sql="update empleado set Rut=?, Nombres=?, Telefono=?,Estado=?,User=? where IdEmpleado=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getRut());
            ps.setString(2, em.getNom());
            ps.setString(3, em.getTel());
            ps.setString(4, em.getEstado());
            ps.setString(5, em.getUser());
            ps.setInt(6, em.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.severe("Error al actualizar empleado"+e);
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from empleado where IdEmpleado=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, String.valueOf(id));
            ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.severe("Error al eliminar empleado"+e);
        }
    }
    
}
