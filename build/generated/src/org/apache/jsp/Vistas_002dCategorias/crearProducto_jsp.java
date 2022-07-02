package org.apache.jsp.Vistas_002dCategorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/pie.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      Model.Producto producto = null;
      synchronized (session) {
        producto = (Model.Producto) _jspx_page_context.getAttribute("producto", PageContext.SESSION_SCOPE);
        if (producto == null){
          producto = new Model.Producto();
          _jspx_page_context.setAttribute("producto", producto, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      Model.Categoria categoria = null;
      synchronized (session) {
        categoria = (Model.Categoria) _jspx_page_context.getAttribute("categoria", PageContext.SESSION_SCOPE);
        if (categoria == null){
          categoria = new Model.Categoria();
          _jspx_page_context.setAttribute("categoria", categoria, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Control de inventario</title>\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Estilo personalizado -->\r\n");
      out.write("<link href=\"bootstrap337/css/estilo-base.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Estilo personalizado -->\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap-theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("<!-- Script js de boostrap -->\r\n");
      out.write("<script src=\"bootstrap337/js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"bootstrap337/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Script libreria jquery -->");
      out.write("\r\n");
      out.write("         <script type=\"text/javascript\">\r\n");
      out.write("             function regresar(url){\r\n");
      out.write("                 location.href = url;\r\n");
      out.write("             }\r\n");
      out.write("         </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Estilo personalizado -->\r\n");
      out.write("<link href=\"bootstrap337/css/estilo-base.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Estilo personalizado -->\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap-theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"bootstrap337/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("<!-- Script js de boostrap -->\r\n");
      out.write("<script src=\"bootstrap337/js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"bootstrap337/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Script libreria jquery -->");
      out.write("\r\n");
      out.write("        <h3>Agregar Registro de Producto</h3>\r\n");
      out.write("        <form class=\"form-horizontal\" id=\"frmProducto\" name=\"frmProducto\" action=\"");
      out.print( request.getContextPath() );
      out.write("/productos\" method=\"post\">\r\n");
      out.write("            <input type=\"hidden\" name=\"id_producto\" value=\"");
      out.print( producto.getId_producto() );
      out.write("\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"txtNomProducto\" class=\"col-sm-2 control-label\">Nombre:</label>\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"txtNomProducto\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                <div class=\"form-group\" >\r\n");
      out.write("                    <label for=\"txtstock\" class=\"col-sm-2 control-label\">Stock</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtstock\"> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\" >\r\n");
      out.write("                    <label for=\"txtprecio\" class=\"col-sm-2 control-label\">Precio</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtprecio\" > \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"form-group\" >\r\n");
      out.write("                    <label for=\"txtunidaMedida\" class=\"col-sm-2 control-label\">Unidad de medida</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtunidaMedida\" > \r\n");
      out.write("                    </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                     <div class=\"form-group\" >\r\n");
      out.write("                    <label for=\"txtestado\" class=\"col-sm-2 control-label\">Estado</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtestado\" > \r\n");
      out.write("                    </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"form-group\" >\r\n");
      out.write("                         CATEGORIA: <select multiple name=\"categoria\" for=\"txtcategoria\" class=\"col-sm-2 control-label\">Categoria</select>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <option>Categorias1");
      out.print( categoria.getId_categoria() );
      out.write("</option>\r\n");
      out.write("                        <option> Categoria2");
      out.print( categoria.getNom_categoria() );
      out.write("</option>\r\n");
      out.write("                     <td>");
      out.print( categoria.getEstado_categoria() );
      out.write("</td>\r\n");
      out.write("                        <!--<input type=\"text\" class=\"form-control\" name=\"txtcategoria\" > \r\n");
      out.write("                    </div>-->\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-success btn-sm\" name=\"btnGuardar\" value=\"GUARDA\"/>\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-danger btn-sm\" onclick=\"regresar('");
      out.print(request.getContextPath() );
      out.write("/productos?opcion=listar')\" name=\"btnRegresar\" value=\"Regresar\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("        </form>\r\n");
      out.write("                          ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <!-- Aqui se deben cerrar las DIV abiertos en encabezado.jspf -->\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"pie\">\r\n");
      out.write("                   &COPY; Haydee B - Astrid G - Jorge G \"ITCA-FEPADE\"\r\n");
      out.write("         </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
