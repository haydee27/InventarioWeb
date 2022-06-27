
package Test;

import DAO.ProductoDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.util.List;

public class PruebaP {
    public static void main(String[] args) {
        PruebaP evaluar = new PruebaP();
        //evaluar.listarProductos();
       // evaluar.editarProducto();
        evaluar.guardaProducto();
        
    }

   /* public void listarProductos() {
       ProductoDAO producto = new ProductoDAOImplementar();
       List<Producto> listar = producto.Listar();
        System.out.println("Listado de producto");
        for(Producto productoListar : listar){
                   System.out.println( "ID: " + productoListar.getId_producto() +
                           "Nombre: " + productoListar.getNom_producto() +  
                    "Categoria: " + productoListar.getCategoria_id() +
                     "Stock" + productoListar.getStock() + 
                     "Precio: " + productoListar.getPrecio() +
                    "Unidad de medida: " + productoListar.getUnidadMedida() + 
                    "Estado: " + productoListar.getEstado() );
        }
    
    }*/
    public void editarProducto(){
        ProductoDAO producto = new ProductoDAOImplementar();
        Producto pro_edit = producto.editarPro(1);
        System.out.println("PRODUCTOS A MODIFICAR");
        System.out.println("ID: " + pro_edit.getId_producto() +
                                        "NOMBRE: " + pro_edit.getNom_producto() +
                                       "CATEGORIA: " + pro_edit.getCategoria() +
                                      "STOCK: " + pro_edit.getStock() +
                                      "PRECIO: " + pro_edit.getPrecio() +
                                       "UNIDAD DE MEDIDA: " + pro_edit.getUnidadMedida() +
                                      "ESTADO: " + pro_edit.getEstado());
    }
    
    public void guardaProducto(){
        ProductoDAO producto = new ProductoDAOImplementar();
        Producto guarda_pro = new Producto();
        guarda_pro.setNom_producto("blusas");
        guarda_pro.setEstado(2);
        guarda_pro.setStock(8);
        guarda_pro.setUnidadMedida("pieza");
        guarda_pro.setCategoria_id(8);
        guarda_pro.setPrecio(12);
        producto.guardarPro(guarda_pro);
        
    }
}
