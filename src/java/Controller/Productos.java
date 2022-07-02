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
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //this.listaProductos(request, response);
       
       String estado = request.getParameter("opcion");
        String id_pro = request.getParameter("id");
        String nom_producto = request.getParameter("nombre");
        String stock = request.getParameter("stock");
        String precio = request.getParameter("precio");
        String unidad = request.getParameter("unidad");
        String estado_pro = request.getParameter("estado");
        String Categoria = request.getParameter("categoria");
        //System.out.println(parametro + "CREAR") ;
       if(estado.equals("listar")){
           this.listaProductos(request, response);
       }else if(estado.equals("crear")){
           //System.out.println("Crear Producto nuevos");
           String pagina = "/Vistas-Categorias/crearProducto.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            response.sendRedirect(pagina);
       }else if(estado.equals("eliminar")){
           System.out.println("Baja de Productos");
           RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/bajaProducto.jsp?id="+id_pro+"&&nombre="+nom_producto+"&&stock"+stock+ "&&precio"+ precio+ "&&unidad" + unidad +"&&estado" + estado_pro + "&&categoria" + Categoria);
           dispatcher.forward(request, response);
           //this.listaProductos(request, response);
       }else{
       }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Producto producto = new Producto();
        
        producto.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
        producto.setNom_producto(request.getParameter("txtNomProducto"));
        producto.setStock(Float.parseFloat(request.getParameter("txtstock")));
        producto.setPrecio(Float.parseFloat(request.getParameter("txtprecio")));
        producto.setUnidadMedida(request.getParameter("txtunidaMedida"));
        producto.setEstado(Integer.parseInt(request.getParameter("txtestado")));
        producto.setCategoria(Integer.parseInt(request.getParameter("txtcategoria")));
        
        ProductoDAO guardaProducto = new ProductoDAOImplementar();
        guardaProducto.guardarPro(producto);
        this.listaProductos(request, response);
        
    }

   
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
