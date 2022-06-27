package Factory;

import java.sql.*;

public final class MySQLConexionFactory extends ConexionBD{

    public MySQLConexionFactory(String[] criterios) {
        this.parametros = criterios; //Pasar los criterios al array de la clase padre, parametros
        this.open(); //Llamar al metodo open();
    }
     //implementar el metodo open 

    @Override
    public Connection open() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //En this.parametros[] iran los datos respectivos de nombre de la BD, usuario y clave
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" 
                    + this.parametros[0], this.parametros[1], this.parametros[2]);
            
        } catch (Exception ex) {
            System.out.println("conexion ok");
            ex.printStackTrace();
            System.out.println("ERROR!");
      
    }
        return this.conexion;
    }
}
   
    
    
    

