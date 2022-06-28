/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ULISES CASTRO
 */
public class BajaProducto extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       /* try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BajaProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BajaProducto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
         */
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
        
        String respuesta = request.getParameter("respuesta");
        String id = request.getParameter("id");
        
        ProductoDAO producto = new  ProductoDAOImplementar();
        //Producto Pro = new Producto();
        if(producto.borrarPro(Integer.parseInt(id))){
            System.out.println("Registro Eliminado correctamente.");
            this.listaProducto(request, response);
        }else{
            System.out.println("Error. No se puede Eliminar el registro.");
        }
    }

    protected void listaProducto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductoDAO producto = new ProductoDAOImplementar();
         HttpSession sesion = request.getSession(true);
         sesion.setAttribute("lista", producto.Listar());
         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Producto/listarProducto.jsp");
         dispatcher.forward(request, response);
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
