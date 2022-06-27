
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="producto" scope="session" class="Model.Producto" />

<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
         <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
         <script type="text/javascript">
             function regresar(url){
                 location.href = url;
             }
         </script>
    </head>
    <body>
         <%@include file = "WEB-INF/Vistas-Parciales/css-js.jspf" %>
         
        <h3>Agregar Registro de Producto</h3>
        <form class="form-horizontal" id="frmProducto" name="frmProducto" action="<%= request.getContextPath() %>/Productos" method="post">
            <input type="hidden" name="id_producto" value="<%= producto.getId_producto() %>">
            <div class="form-group">
                <label for="txtNomProducto" class="col-sm-2 control-label">Nombre:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtNomProducto" value="<%= producto.getNom_producto() %>">
                </div>
            </div>
                <div class="form-group" >
                    <label for="txtstock" class="col-sm-2 control-label">Stock</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtstock" value="<%= producto.getStock() %>"> 
                    </div>
                </div>
                <div class="form-group" >
                    <label for="txtprecio" class="col-sm-2 control-label">Precio</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtprecio" value="<%= producto.getPrecio()%>"> 
                    </div>
                </div>
                 <div class="form-group" >
                    <label for="txtunidaMedida" class="col-sm-2 control-label">Unidad de medida</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtunidaMedida" value="<%= producto.getUnidadMedida()%>"> 
                    </div>
                 </div>
                     <div class="form-group" >
                    <label for="txtestado" class="col-sm-2 control-label">Estado</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtestado" value="<%= producto.getEstado() %>"> 
                    </div>
                     </div>
                     <div class="form-group" >
                    <label for="txtcategoria" class="col-sm-2 control-label">Categoria</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="txtcategoria" value="<%= producto.getCategoria()%>"> 
                    </div>
                </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                        <input type="submit" class="btn btn-success btn-sm" name="btnGuardar" value="GUARDA"/>
                        <input type="button" class="btn btn-danger btn-sm" onclick="regresar('<%=request.getContextPath() %>/productos?opcion=listar')" name="btnRegresar" value="Regresar"/>
                        </div>
                    </div>
        </form>
                          <%@include file="WEB-INF/Vistas-Parciales/pie.jspf"%>
    </body>
</html>
