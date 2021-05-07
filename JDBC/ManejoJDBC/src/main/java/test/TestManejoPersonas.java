package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao  = new PersonaDAO();
        
        //Insertando un nuevo objeto de tipo Persona
        
        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "666272");
        personaDao.insertar(personaNueva);
        
        
        List<Persona> personas = personaDao.seleccionar(); //como seleccionar nos devuelve una lista de personas tenemos que poner una variable que sea una lista de personas
        
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
