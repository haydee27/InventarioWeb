
package Factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ConexionBD {
    protected String[ ] parametros;//Array que recibe los parametros de la conexion
    protected Connection conexion; 
    //El siguiente metodo abstracto no se implementa solamente se declara, se 
    //implementa en la subcase
    
    abstract Connection open(); //Metodo abstacto que devuelve un objeto conecction

    
  //Crear metodo para consultas
public ResultSet consultaSQL (String consulta){
    Statement st; //Objeto statement en el encargado de ejecutar las consultas
    ResultSet rs = null; //Tabla temporal donde se almacenan los datos
    try{
        st = conexion.createStatement();
        rs = st.executeQuery(consulta); //se ejecuta la consulta
    }catch(SQLException ex){
        ex.printStackTrace();
    }
    return rs;
}

//crear metodo para ejecutar
public boolean ejecutarSQL(String consulta){
    Statement st;  //Objeto statement en el encargado de ejecutar las consultas
    boolean guardar = true;
    try{
        st= conexion.createStatement();
        st.executeUpdate(consulta); //se ejecuta la consulta  
    }catch(SQLException ex){
        guardar = false;
        ex.printStackTrace();
    }
    return guardar;
}

    public boolean cerrarConexion() {
        boolean ok = true;
        try {
            conexion.close();
        }catch(SQLException ex) {
            ok = false;
            ex.printStackTrace();
        }
        return ok;
    }
}
