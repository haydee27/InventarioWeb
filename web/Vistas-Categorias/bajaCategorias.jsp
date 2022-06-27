
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String id_cat = request.getParameter("id");
    String nombre_cat = request.getParameter("nombre");
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BAJA CATEGORIAS</title>
       <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf"  %>
    </head>
    <body>
       <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf"  %>
            <div class="col-auto bg-grayp-5 txt-center">
        <h1> Baja de categorias </h1>
        
        <h4>¿Realmente Desea Eliminar el Registro?</h4>
        <h5>ID Categoria: <%=id_cat %></h5>
        <h5>Nombre Categoria: <%=nombre_cat %></h5>
            </div>
            
            
            
            <div class="d-grid gap-5d-md-flex justify-content-md-center">
                <a href="BajaCategorias?respuesta=yes&&id=<%= id_cat %>" class="btn btn-primary btn-lg" role="button">Si / Aceptar</a>
          
                <a href="Categorias?opcion=listar" class="btn btn-secondary btn-lg" role="button">NO / Cancelar</a>
            </div> 
                
                <div class="row justify-content-center">
                <div class="col-4 bg-white">
                    &nbsp; 
                 </div>
                    <div class="col-4 bg-white">
                        &nbsp;
                    </div>
                </div>  
                
                
                
               <%@include  file="../WEB-INF/Vistas-Parciales/pie.jspf"  %>
    </body>
</html>
