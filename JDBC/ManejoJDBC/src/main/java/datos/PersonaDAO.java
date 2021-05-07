package datos;


import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAO { //esta clase va a realizar las operaciones de insert, update, delete pero de la tabla persona

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido,email,telefono) VALUES(?, ?, ?, ?)"; //le pasamos ? como parametro en vez de pasarle el nombre directamente

    //metodo que va a devolver una lista de objetos de tipo persona
    public List<Persona> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            //ya tenemos el resultSet, ahora tenemos que iterar cada uno de los registros para poder crear cada objeto de tipo persona por cada registro
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona(idPersona, nombre, apellido, email, telefono); //creamos nuestro objeto de tipo persona usando el constructor con todos los atributos
                //Estamos convirtiendo información de la base de datos en objetos java

                personas.add(persona); //añadimos la persona a la lista de personas
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally { //abrimos un bloque finally que siemrpe se ejecuta para cerrar las conexiones
            try {
                //cerramos las conexiones en el orden inverso al que se abrieron
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return personas;

    }
    
    //el metodo insertar devuelve int porque nos va a mostrar los registros que se han modificado
    public int insertar(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);//una vez pasada la sentencia, vamos a ir cambiando los parámetros
            
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate(); //para que actualice el estado en la base de datos, nos devuelve el número de registros afectados
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }         
            
        }
        
        return registros;
    }
}
