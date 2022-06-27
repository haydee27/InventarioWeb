|

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de Inventario</title>
        <!-- Incluimos la vista parcial la cual contiene las url de la libreria 
        correspondientes a estilos y js -->
        <%@include file = "WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
        <!-- Vistas parciales de la parte superior de nuestra aplicacion -->
        <%@include  file="WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        
        <h3>¡ Bienvenid@!</h3> <!-- Todo en contenido de la aplicacion -->
        
        <!-- Vista parcial de la parte inferior de nuestra aplicacion -->
        <%@include file="WEB-INF/Vistas-Parciales/pie.jspf"%>
    </body>
</html>
