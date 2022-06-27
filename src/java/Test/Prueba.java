
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.util.List;

public class Prueba {
    public static void main(String[] args){
        Prueba evaluar = new Prueba();
        evaluar.guardarCategoria();//Metodo guardar
        evaluar.listarCategoria(); //Metodo listar antes del metodo eliminar
        //evaluar.eliminarCategoria(); //Metodo que eliminara la categoria
       // evaluar.listarCategoria(); //Cosulta si ha sido eliminada la categoria
        //evaluar.editarCategoria(); //Metodo editar
    }

    public void listarCategoria() {
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        List<Categoria> listar = categoria.Listar();
        System.out.println("***************LISTADO DE CATEGORIA***************");
        for(Categoria categoriaListar : listar) {
            System.out.println(" ID: " + categoriaListar.getId_categoria() +
                               " NOMBRE: " + categoriaListar.getNom_categoria() +
                               " ESTADO: " + categoriaListar.getEstado_categoria());
        }
    }

    /*public void editarCategoria() {
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        Categoria cat_edit = categoria.editarCat(1);
        System.out.println("*****************CATEGORIA A MODIFICAR***************");
        System.out.println("ID: " + cat_edit.getId_categoria() + 
                                   " NOMBRE: " + cat_edit.getNom_categoria() +
                                   " ESTADO: " + cat_edit.getEstado_categoria());
    }*/

    public void guardarCategoria() {
       CategoriaDAO categoria = new CategoriaDAOImplementar();
       Categoria guardar_cat = new Categoria();
       guardar_cat.setNom_categoria("Bebidas Naturales "); //Cambiar nombre
       guardar_cat.setId_categoria(7); //Modifica la categoria registrada anteriormente
       guardar_cat.setEstado_categoria(2); //Estado 1
       categoria.guardarCat(guardar_cat);
    }

    public void eliminarCategoria() {
       CategoriaDAO categoria = new CategoriaDAOImplementar();
       categoria.borrarCat(2); //se eliminara la categoria con id_categoria = 2
    }
    
    
}

