package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Empleado;
import dao.EmpleadoDAO;

public class Validar extends HttpServlet {

    
    EmpleadoDAO edao = new EmpleadoDAO();
    Empleado em = new Empleado();
    


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
        String accion = request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar")){
            String user = request.getParameter("txtuser");
            String pass = request.getParameter("txtpass");
            em = edao.validar(user,pass);
            if(em.getUser()!= null){
                request.getRequestDispatcher("Controlador?accion=Principal&user="+em.getUser()).forward(request, response);             
            } else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
                
        }
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
