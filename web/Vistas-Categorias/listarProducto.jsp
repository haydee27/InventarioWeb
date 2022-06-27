<%@page import="Model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="lista" scope="session" class="java.util.List" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de Inventario</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
         <%@include  file="../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
                <!-- <div style="width: 600px"> -->
                <div class="col-auto bg-gray p-5 text-center">
             <a href="<%= request.getContextPath() %>/Productos?opcion=crear" class="btn btn-success btn-sm glyphicon glyphicon-pencil" role="button"> Nuevo Producto</a>
        <h3>LISTADO DE PRODUCTO</h3>
        <table class="table table-striped">
            <tr> 
                <th>ID</th><th>NOMBRE</th><th>ESTADO</th><th>ACCION</th>
            </tr>
            <%
                for(int i=0 ; i <lista.size(); i++){
                Producto producto = new Producto();
                producto = (Producto)lista.get(i);
                %>
                <tr>
                    <td><%= producto.getId_producto()%></td>
                    <td><%= producto.getNom_producto()%></td>
                    <td><%= producto.getCategoria_id()%></td>
                    <td><%= producto.getStock()%></td>
                    <td><%= producto.getPrecio()%></td>
                    <td><%= producto.getUnidadMedida()%></td>
                    <td><%= producto.getEstado()%></td>
                    <td><%= producto.getCategoria()%></td>
                    <td>
                <a href="#" class="btn btn-info btn-sm glyphicon glyphicon-edit" role="button">Editar</a>
                <a href="#" class="btn btn-danger btn-sm glyphicon glyphicon-remove" role="button">Eliminar</a>
                
                    </td>
                </tr>  
                <%
                    }
           %>
        </table>
         </div>
        <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
