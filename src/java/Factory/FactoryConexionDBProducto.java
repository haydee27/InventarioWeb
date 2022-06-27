package Factory;

import Factory.ConexionBDProducto;

public class FactoryConexionDBProducto  {
    
    
    public static final int MySQL = 1;
    public static String[ ] configMySQL = {"bd_inventario", "root", ""};
    
    public static ConexionBDProducto open(int tipoBD){
        switch(tipoBD){
            case FactoryConexionDBProducto.MySQL:
                System.out.println("OK");
            return new MySQLConexionFactoryProducto(configMySQL);
            default: 
                return null;
               
                
        }
    }
        public static void main(String[] args){
            open(1);
        
    }

    
}
