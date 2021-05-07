package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;

public class PesonaDAO { //esta clase va a realizar las operaciones de insert, update, delete pero de la tabla persona
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    
    //metodo que va a devolver una lista de objetos de tipo persona
    public List<Persona> seleccionar(){
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        
        
    }
}
