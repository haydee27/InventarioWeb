<%-- 
    Document   : bajaProducto
    Created on : 06-27-2022, 10:41:19 PM
    Author     : ULISES CASTRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<%
    String id_Pro = request.getParameter("id");
    String nombre_Pro = request.getParameter("nombre"); 
   %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BAJA PRODUCTO</title>
        <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf"  %>
    </head>
    <body>
        <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf"  %>
        <div class="col-auto bg-grayp-5 txt-center">
        <h1>Baja de productos</h1>
        
        <h2>¿Realmente Desea Eliminar el Registro?</h2>
        <h3>ID Producto: <%= id_Pro %></h3>
        <h4>Nombre Producto: <%= nombre_Pro %></h4>
        
    </div>
        
        <div class="d-grid gap-5 d-md-flex justify-content-md-center">
        <a href="bajaProduco?respuesta=yes&&id=<%= id_Pro %>" class="btn btn-primary btn-lg" role="button">Si / Aceptar</a>
            <!--<a href="< //request.getContextPath() >" class="btn btn-secondary btn-lg" role="button">No / Cancelar</a>-->
            <a href="producto?opcion=listar" class="btn btn-secondary btn-lg" role="button">No / Cancelar</a>
        
        </div>
            
            div class="row justify-content-center">
        <div class="col-4 bg-white">
            &nbsp;
        </div>
        <div class="col-4 bg-white">
            &nbsp;
        </div>
      
        <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
