package Factory;

import java.sql.*;

public final class MySQLConexionFactoryProducto extends ConexionBDProducto  {
    
    public MySQLConexionFactoryProducto(String[] criterios){
       this.parametros= criterios;
       this.open();
}

    
    @Override
    public Connection open() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" 
                    + this.parametros[0], this.parametros[1], this.parametros[2]);
            
        }catch(Exception ex){
            System.out.println("Conexion ok");
           ex.printStackTrace();
            System.out.println("Error!");
        }
        return this.conexion;
    }
    
    
}