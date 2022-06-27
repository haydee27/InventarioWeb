package Controller;

import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Productos extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Productos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Productos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.listaProductos(request, response);
       String parametro = request.getParameter("opcion");
       String estado = request.getParameter("opcion");
        String id_producto = request.getParameter("id");
        String nom_producto = request.getParameter("nombre");
       
       if(parametro.equals("crear")){
           System.out.println("Crear Producto");
           String pagina = "/Vistas-Categorias/crearProducto.jsp";
           RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
           dispatcher.forward(request, response);
       }else{
           this.listaProductos(request, response);
       }
       
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
        Producto producto = new Producto();
        
        producto.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
        producto.setNom_producto(request.getParameter("txtNomProducto"));
        producto.setStock(Integer.parseInt(request.getParameter("txtstock")));
        producto.setPrecio(Integer.parseInt(request.getParameter("txtprecio")));
        producto.setUnidadMedida(request.getParameter("txtunidaMedida"));
        producto.setEstado(Integer.parseInt(request.getParameter("txtestado")));
        
        ProductoDAO guardaProducto = new ProductoDAOImplementar();
        guardaProducto.guardarPro(producto);
        this.listaProductos(request, response);
        
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

    protected void listaProductos(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
        response.setContentType("text/html;charset-UTF-8");
        
        ProductoDAO producto = new ProductoDAOImplementar();
        
        HttpSession session = request.getSession(true);
        session.setAttribute("lista", producto.Listar());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/listarProducto.jsp");
        dispatcher.forward(request, response);
        
    }

}
