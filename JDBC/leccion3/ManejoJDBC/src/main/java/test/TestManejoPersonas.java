package test;

import datos.*;
import domain.PersonaDTO;
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
            
             IPersonaDao personaDao = new PersonaDaoJDBC(conexion); //le pasamos al objeto la conexion que hemos creado
             
             List<PersonaDTO> personas = personaDao.seleccionar();
             
             for(PersonaDTO persona: personas){
                 System.out.println("persona DTO = " + persona);
             }
             
             
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
