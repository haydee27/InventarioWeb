
package Model;

public class Producto {
   private int id_producto;
   private String nom_producto;
   private float stock;
   private float precio;
   private String unidadMedida;
   private int estado;
   private int categoria; // Objeto categoria

    public Producto() {
        this.id_producto = 0;
         //Inicializae el modelo categoria
    }

    public Producto(int id_producto, String nom_producto, float stock, float precio, String unidadMedida, int estado, int categoria) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.stock = stock;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
        this.estado = estado;
        this.categoria = categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }


    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
   
   
}