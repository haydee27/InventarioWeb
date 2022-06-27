package DAO;

import Factory.ConexionBDProducto;
import Factory.FactoryConexionDBProducto;
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
            producto.setCategoria_id(resultadoSQL.getInt("categoria_id"));
            producto.setStock(resultadoSQL.getFloat("stock"));
            producto.setPrecio(resultadoSQL.getFloat("precio"));
            producto.setUnidadMedida(resultadoSQL.getNString("unidadMedida"));
            producto.setEstado(resultadoSQL.getInt("estado"));
            lista.add(producto);
        }
    }catch(Exception ex){
        
    }finally{
        this.conn.cerrarConexion();
    }
      return lista;
    }

    @Override
    public List<Producto> Listar2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                   producto.setCategoria_id(resultadoSQL.getInt("categoria_id"));
                   producto.setStock(resultadoSQL.getFloat("stock"));
                   producto.setPrecio(resultadoSQL.getFloat("precio"));
                   producto.setUnidadMedida(resultadoSQL.getNString("unida_medida"));
                   producto.setUnidadMedida(resultadoSQL.getString("estado"));
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
                
                miSQL.append("INSERT INTO tb_producto(nom_producto, categoria_id, stock, precio, unidad_medida, estado)VALUES('");
                miSQL.append(producto.getNom_producto() + " ', ").append(producto.getCategoria() + " ', ").append(producto.getStock() + " ', ").append(producto.getPrecio() + " ', ").append(producto.getUnidadMedida()+ " ', ").append(producto.getEstado());
                miSQL.append(");");
                
                this.conn.ejecutarSQL(miSQL.toString());
            }else if(producto.getId_producto() > 0){
            }
            }catch (Exception e){
                     }finally{
                            this.conn.cerrarConexion();
                            }
                    return guarda;
        }

    @Override
    public boolean borrarPro(int id_pro_borrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    } 