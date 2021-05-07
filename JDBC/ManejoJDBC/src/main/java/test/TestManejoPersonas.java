package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao  = new PersonaDAO();
        
        //Insertando un nuevo objeto de tipo Persona
        
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "666272");
//        personaDao.insertar(personaNueva);

        //modificar un objeto de persona existente
//        Persona personaNueva = new Persona(4,"Juan Carlos", "Esparza", "jcesparza@mail.com", "666272");
//        personaDao.actualizar(personaNueva);
        
        //eliminar un registro
        
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
        
        List<Persona> personas = personaDao.seleccionar(); //como seleccionar nos devuelve una lista de personas tenemos que poner una variable que sea una lista de personas
        
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
