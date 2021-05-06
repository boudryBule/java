package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class TestMySqlJDBC {
    public static void main(String[] args) {
        
        //para conectarnos a la BBDD de mysql tenemos que realizar ditintos pasos
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true"; //ponemos localhost porque es ip local, si no ponemos la que estemos usando
                                                                       //useSSL quiere indicar que no vamos a usar el puerto seguro
                                                                       //allowPublicKeyRetrieval para que nos podamos conectar de forma exitosa
//        try {
//           
//            Class.forName("com.mysql.cj.jdbc.Driver"); //este paso ya no es requerido, hay que poner la clase con la que vamos a trabajar con mysql
            try {
                Connection conexion = DriverManager.getConnection(url, "root", "admin");
                Statement instruccion = conexion.createStatement(); //el objeto de tipo statement nos va a permitir ejecutar sentencias sobre nuestra tabla de base datos
                var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
                ResultSet resultado = instruccion.executeQuery(sql);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace(System.out);
//        }
    }                       
}
