<%-- 
    Document   : editarProducto
    Created on : 06-28-2022, 10:35:20 AM
    Author     : ULISES CASTRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String id_Pro = request.getParameter("id");
    String nombre_Pro = request.getParameter("nombre");
    String categoria_Pro = request.getParameter("categoria");
    String stock_Pro = request.getParameter("stock");
    String unidadMedida = request.getParameter("unidadMedida");
    String estado = request.getParameter("estado");
    
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
