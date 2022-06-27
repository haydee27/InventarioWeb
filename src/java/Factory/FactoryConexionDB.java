
package Factory;

import Factory.ConexionBD;

public class FactoryConexionDB {
    //podeos definir la configuracion para diferentes BD
    public static final int MySQL = 1; //Para conectar a MySQL
    public static String[] configMySQL = { "bd_inventario", "root", ""};
    
    public static ConexionBD open (int tipoBD){
        switch(tipoBD){
            case FactoryConexionDB.MySQL:
            return new MySQLConexionFactory(configMySQL);
            default:
                    return null;
        }
    }
     public static void main(String[] args) {
        open (1);
    }
}
