package test;

import datos.*;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {
    public static void main(String[] args) {
    
       Connection conexion = null; //tiene que estar declarada fuera del bloque try catch para poder usarla dentro
        
        try {
                conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false); //necesitamos que no se haga autocommit porque nosotros vamos a hacerlo manualmente
            }
            
             PersonaDAO personaJdbc = new PersonaDAO(conexion); //le pasamos al objeto la conexion que hemos creado
             
             Persona cambioPersona = new Persona();
             cambioPersona.setIdPersona(2);
             cambioPersona.setNombre("Pepa");
             cambioPersona.setApellido("Gomez");
             cambioPersona.setEmail("pgomez@mail.com");
             cambioPersona.setTelefono("123123");
             personaJdbc.actualizar(cambioPersona);
             
             
             
             Persona nuevaPersona = new Persona();
             nuevaPersona.setNombre("Carlos");
             //nuevaPersona.setApellido("Ramirezaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); //al pasarnos de caracteres salta la excepción y no se realiza ningún cambio, ni el de insertar que estaba correcto, ya que así es el manejo de transacciones
             nuevaPersona.setApellido("Ramirez");
             personaJdbc.insertar(nuevaPersona);
             
             conexion.commit();//en este momento es en el que se van a guardar los cambios, ya que hemos modificado  los métodos (actualizar, insertar) para que no se haga el commit de la transaccion de forma automática, si no cuando nosotros queramos
             System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
           try {
               conexion.rollback();
           } catch (SQLException ex1) {
               ex1.printStackTrace(System.out);
           }
        }
    }
}
