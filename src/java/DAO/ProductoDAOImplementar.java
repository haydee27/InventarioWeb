package DAO;

import Factory.ConexionBDProducto;
import Factory.FactoryConexionDB;
import Factory.FactoryConexionDBProducto;
import Model.Categoria;
import Model.Producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImplementar implements ProductoDAO{

    ConexionBDProducto conn;
    
    public ProductoDAOImplementar() {
        
    }
    
    
    @Override
    public List<Producto> Listar() {
     this.conn = FactoryConexionDBProducto.open(FactoryConexionDBProducto.MySQL);
    StringBuilder miSQL = new StringBuilder();
    miSQL.append("SELECT * FROM tb_producto;");
    List<Producto> lista = new ArrayList<Producto>();
    try{
        ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
        while(resultadoSQL.next()){
             Producto producto = new Producto();
            
            producto.setId_producto(resultadoSQL.getInt("id_producto"));
            producto.setNom_producto(resultadoSQL.getString("nom_producto"));
            //producto.setCategoria_id(resultadoSQL.getInt("categoria_id"));
            producto.setStock(resultadoSQL.getFloat("stock"));
            producto.setPrecio(resultadoSQL.getFloat("precio"));
            producto.setUnidadMedida(resultadoSQL.getNString("unidad_de_medida"));
            producto.setEstado(resultadoSQL.getInt("estado_producto"));
            producto.setCategoria(resultadoSQL.getInt("categoria"));
            
            lista.add(producto);
        }
    }catch(Exception ex){
        
    }finally{
        this.conn.cerrarConexion();
    }
      return lista;
    }

    @Override
    public List<Categoria> Listar2() {
        this.conn = FactoryConexionDBProducto.open(FactoryConexionDB.MySQL);
        StringBuilder MiSQL = new StringBuilder(); //Contruir la consulta
        MiSQL.append("SELECT * FROM tb_categoria;"); // Agregar la consulta
        List<Categoria> listar = new ArrayList<Categoria>();
        try{
            //Se crea el objeto ResultSet implementa el metodo(consultarSQL) creado para la consulta
            ResultSet resultadoSQL = this.conn.consultaSQL(MiSQL.toString());
        while(resultadoSQL.next()){
            Categoria categoria = new Categoria(); //Declarar el objeto categoria
            //Asignar cada campo consultado al atributo en la clase
            categoria.setId_categoria(resultadoSQL.getInt("id_categoria"));
            categoria.setNom_categoria(resultadoSQL.getString("nom_categoria"));
            categoria.setEstado_categoria(resultadoSQL.getInt("estado_categoria"));
            listar.add(categoria); //Asignar al array cada registro encontrado
        }
            
        }catch(Exception ex){
                
        } finally{
            this.conn.cerrarConexion(); //Para cerrar la conexion      
        }
                return listar;
    }

    @Override
    public Producto editarPro(int id_pro_edit) {
           this.conn = FactoryConexionDBProducto.open(FactoryConexionDBProducto.MySQL);
           Producto producto = new Producto();
           StringBuilder miSQL = new StringBuilder();
           
           miSQL.append("SELECT * FROM tb_producto WHERE id_producto = ").append(id_pro_edit);
           try{
               ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
                while(resultadoSQL.next()){
                   producto.setId_producto(resultadoSQL.getInt("id_producto"));
                   producto.setNom_producto(resultadoSQL.getString("nom_producto"));
                   producto.setStock(resultadoSQL.getFloat("stock"));
                   producto.setPrecio(resultadoSQL.getFloat("precio"));
                   producto.setUnidadMedida(resultadoSQL.getNString("unidad_de_medida"));
                   producto.setEstado(resultadoSQL.getInt("estado_producto"));
                   producto.setCategoria(resultadoSQL.getInt("categoria"));
               }
           }catch (Exception e){
                   
                   }finally{
                           this.conn.cerrarConexion();
                           }
                   return producto;
           }

    @Override
    public boolean guardarPro(Producto producto) {
        this.conn = FactoryConexionDBProducto.open(FactoryConexionDBProducto.MySQL);
        boolean guarda = false;
        try{
            if(producto.getId_producto() == 0){
                StringBuilder miSQL = new StringBuilder();
                
              miSQL.append("INSERT INTO tb_producto(nom_producto, stock, precio, unidad_de_medida, estado_producto, categoria) VALUES (' ");
              miSQL.append(producto.getNom_producto() + "', '").append(producto.getStock() + "', '").append(producto.getPrecio() + "', '").append(producto.getUnidadMedida() + "', '").append(producto.getEstado() + "' , ").append(producto.getCategoria()).append("\'");
              miSQL.append(" ); ");
                
                this.conn.ejecutarSQL(miSQL.toString());
            }else if(producto.getId_producto() > 0){
                StringBuilder miSQL = new StringBuilder();
                miSQL.append("UPDATE tb_producto SET id_producto = ").append(producto.getId_producto());
                miSQL.append(", nom_producto = ' ").append(producto.getNom_producto());
                miSQL.append("', stock = ' ").append(producto.getStock());
                miSQL.append("', precio =  '").append(producto.getPrecio());
                miSQL.append("', unidad_de_medida =  '").append(producto.getUnidadMedida());
                miSQL.append("', estado_producto =  '").append(producto.getEstado());
                miSQL.append(" WHERE id_producto = ").append(producto.getId_producto()).append(";");
                
                this.conn.ejecutarSQL(miSQL.toString());
            }
            guarda = true;
            }catch (Exception e){
                     }finally{
                            this.conn.cerrarConexion();
                            }
                    return guarda;
        }

    @Override
    public boolean borrarPro(int id_pro_borrar) {
        this.conn = FactoryConexionDBProducto.open(FactoryConexionDBProducto.MySQL);
       boolean borra = false; // Bandera de resultado
       try{
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("DELETE FROM tb_producto WHERE id_producto = ").append(id_pro_borrar);
       this.conn.ejecutarSQL(miSQL.toString());
       borra = true;
    }catch (Exception e){
    }finally{
           this.conn.cerrarConexion();
       }
    return borra;
    }
}
    