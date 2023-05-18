/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Carrito;
import modelo.Empleado;
import modelo.EmpleadoDAO;
import modelo.Producto;
import modelo.ProductoDAO;

/**
 *
 * @author docencia
 */
public class Controlador extends HttpServlet {
    
    private static final String ACCION_EMPLEADO_MENU_LISTAR = "Controlador?accion=Empleado&menu=Listar";
    private static final String ACCION_PRODUCTO_MENU_LISTAR = "Controlador?accion=Producto&menu=Listar";
    private static final String CASE_DELETE = "Delete";
    
    ProductoDAO pdao = new ProductoDAO();
    List<Producto> productos = new ArrayList<>();
    Producto p = new Producto();
    
    List<Carrito> listaCarrito = new ArrayList<>();
    int item;
    double totalPagar = 0.0;
    int cantidad = 1;
    
    int ide;
    int idc;
    int idp;
    Carrito car;
    
    Empleado em = new Empleado();
    EmpleadoDAO edao = new EmpleadoDAO();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        productos = pdao.listar();
        
        switch (accion) {
            case "Empleado":
                
                switch (menu) {
                case "Listar":
                    List<Empleado> lista = edao.listar();
                    request.setAttribute("empleados", lista);
                    break;
                case "Agregar":
                    String rut = request.getParameter("txtRut");
                    String nom = request.getParameter("txtNombres");
                    String tel = request.getParameter("txtTel");
                    String est = request.getParameter("txtEstado");
                    String user = request.getParameter("txtUser");
                    em.setRut(rut);
                    em.setNom(nom);
                    em.setTel(tel);
                    em.setEstado(est);
                    em.setUser(user);
                    edao.agregar(em);
                    request.getRequestDispatcher(ACCION_EMPLEADO_MENU_LISTAR).forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Empleado e = edao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher(ACCION_EMPLEADO_MENU_LISTAR).forward(request, response);
                    break;
                case "Actualizar":
                    String rut1 = request.getParameter("txtRut");
                    String nom1 = request.getParameter("txtNombres");
                    String tel1 = request.getParameter("txtTel");
                    String est1 = request.getParameter("txtEstado");
                    String user1 = request.getParameter("txtUser");
                    em.setRut(rut1);
                    em.setNom(nom1);
                    em.setTel(tel1);
                    em.setEstado(est1);
                    em.setUser(user1);
                    em.setId(ide);
                    edao.actualizar(em);
                    request.getRequestDispatcher(ACCION_EMPLEADO_MENU_LISTAR).forward(request, response);
                    break;
                case CASE_DELETE:
                    ide = Integer.parseInt(request.getParameter("id"));
                    edao.delete(ide);
                    request.getRequestDispatcher(ACCION_EMPLEADO_MENU_LISTAR).forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            
       
        
                
                
               request.getRequestDispatcher("Empleado.jsp").forward(request, response);
               break;
            case "Principal":
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
                break;
                
            case "Producto":
                
                switch (menu) {
                case "Listar":
                    List<Producto> lista = pdao.listar();
                    request.setAttribute("productos", lista);
                    break;
                case "Agregar":
                    String nom = request.getParameter("txtNombre");
                    String des = request.getParameter("txtDescrip");
                    double precio = Double.parseDouble(request.getParameter("txtPrecio"));
                    int stock = Integer.parseInt(request.getParameter("txtStock"));
                    p.setNombres(nom);
                    p.setDescripcion(des);
                    p.setPrecio(precio);
                    p.setStock(stock);
                    pdao.agregar(p);
                    request.getRequestDispatcher(ACCION_PRODUCTO_MENU_LISTAR).forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Producto prod = pdao.listarId(ide);
                    request.setAttribute("producto", prod); 
                    request.getRequestDispatcher(ACCION_PRODUCTO_MENU_LISTAR).forward(request, response);
                    break;
                case "Actualizar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    String nombre = request.getParameter("txtNombre");
                    String descrip = request.getParameter("txtDescrip");
                    double pre = Double.parseDouble(request.getParameter("txtPrecio"));
                    int sto = Integer.parseInt(request.getParameter("txtStock"));
                    p = new Producto();
                    p.setId(ide);
                    p.setNombres(nombre);
                    p.setDescripcion(descrip);
                    p.setPrecio(pre);
                    p.setStock(sto);
                    pdao.actualizar(p);
                    request.getRequestDispatcher(ACCION_PRODUCTO_MENU_LISTAR).forward(request, response);
                    break;
                case CASE_DELETE:
                    ide = Integer.parseInt(request.getParameter("id"));
                    pdao.delete(ide);
                    request.getRequestDispatcher(ACCION_PRODUCTO_MENU_LISTAR).forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            
                
                request.getRequestDispatcher("Producto.jsp").forward(request, response);
                
                
                break;
            case "Cliente":
                request.getRequestDispatcher("Clientes.jsp").forward(request, response);
                break;
            case "Comprar":
                totalPagar = 0;
                int idparam = Integer.parseInt(request.getParameter("id"));
                p = pdao.listarId(idparam);
                item = item + 1;
                Carrito cart = new Carrito();
                cart.setItem(item);
                cart.setIdProducto(p.getId());
                cart.setNombres(p.getNombres());
                cart.setDescripcion(p.getDescripcion());
                cart.setPrecioCompra(p.getPrecio());
                cart.setCantidad(cantidad);
                cart.setSubTotal(cantidad * p.getPrecio());
                listaCarrito.add(cart);
                totalCarrito();
                request.setAttribute("carrito", listaCarrito);
                request.setAttribute("contador", listaCarrito.size());
                request.setAttribute("totalPagar", totalPagar);
                request.getRequestDispatcher("carrito.jsp").forward(request, response);

                break;
            case "AgregarCarrito":
                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.listarId(idp);
                item = item + 1;
                car = new Carrito();
                car.setItem(item);
                car.setIdProducto(p.getId());
                car.setNombres(p.getNombres());
                car.setDescripcion(p.getDescripcion());
                car.setPrecioCompra(p.getPrecio());
                car.setCantidad(cantidad);
                car.setSubTotal(cantidad * p.getPrecio());
                listaCarrito.add(car);
                request.setAttribute("contador", listaCarrito.size());
                request.getRequestDispatcher("Controlador?accion=home").forward(request, response);

                break;
            case CASE_DELETE:
                int idproducto = Integer.parseInt(request.getParameter("idp"));
                for (int i = 0; i < listaCarrito.size(); i++) {
                    if(listaCarrito.get(i).getIdProducto() == idproducto){
                        listaCarrito.remove(i);
                    }
                }
                break;
            case "Carrito":
                totalPagar = 0;
                request.setAttribute("carrito", listaCarrito);
                totalCarrito();
                request.setAttribute("totalPagar", totalPagar);
                request.getRequestDispatcher("carrito.jsp").forward(request, response);
                break;
                
            case "GenerarCompra":
              
                for (int i = 0; i < listaCarrito.size(); i++) {
                    int cantidadCarro = listaCarrito.get(i).getCantidad();
                    int idpr = listaCarrito.get(i).getIdProducto();
                    ProductoDAO ao = new ProductoDAO();
                    Producto pr = ao.buscar(idpr);
                    int sac = pr.getStock() - cantidadCarro;
                    ao.actualizarStock(idpr, sac);
                    listaCarrito.clear();
                }
                break;

            default:
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    private void totalCarrito() {
        for (int i = 0; i < listaCarrito.size(); i++) {
            totalPagar += listaCarrito.get(i).getSubTotal();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
