package datos;


import domain.PersonaDTO;
import java.sql.*;
import java.util.*;


public class PersonaDaoJDBC implements IPersonaDao{ //esta clase va a realizar las operaciones de insert, update, delete pero de la tabla persona
    
    
    private Connection conexionTransaccional; //queremos hacer una variable de tipo conexion ya que si lo implementamos tal y como está, al abrir y cerrar las conexiones no nos permitiría hacer rollback

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido,email,telefono) VALUES(?, ?, ?, ?)"; //le pasamos ? como parametro en vez de pasarle el nombre directamente
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    
    //definimos los constructores
    public PersonaDaoJDBC() {
        
    }
    
    public PersonaDaoJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
    
    //metodo que va a devolver una lista de objetos de tipo persona
    public List<PersonaDTO> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonaDTO persona = null;
        List<PersonaDTO> personas = new ArrayList<>();

        try {
            //comprobamos si hay conexion transaccional, si no la hay usamos la conexion normal
            conn = this.conexionTransaccional != null ? this.conexionTransaccional: Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            //ya tenemos el resultSet, ahora tenemos que iterar cada uno de los registros para poder crear cada objeto de tipo persona por cada registro
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new PersonaDTO(idPersona, nombre, apellido, email, telefono); //creamos nuestro objeto de tipo persona usando el constructor con todos los atributos
                //Estamos convirtiendo información de la base de datos en objetos java

                personas.add(persona); //añadimos la persona a la lista de personas
            }
        } 
         finally { //abrimos un bloque finally que siemrpe se ejecuta para cerrar las conexiones
            try {
                //cerramos las conexiones en el orden inverso al que se abrieron
                Conexion.close(rs);
                Conexion.close(stmt);
                
               if(this.conexionTransaccional == null) { //si es nulo es que se ha creado una nueva transaccion de este método,  por lo que se tiene que cerrar
                                                        //si el valor es distinto de nulo, no se cierra
                   Conexion.close(conn);
               }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return personas;

    }
    
    //el metodo insertar devuelve int porque nos va a mostrar los registros que se han modificado
    public int insertar(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional: Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);//una vez pasada la sentencia, vamos a ir cambiando los parámetros
            
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate(); //para que actualice el estado en la base de datos, nos devuelve el número de registros afectados
        } 
        finally{
            try {
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) { //si es nulo es que se ha creado una nueva transaccion de este método,  por lo que se tiene que cerrar
                    //si el valor es distinto de nulo, no se cierra
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }         
            
        }
        
        return registros;
    }
    
    public int actualizar(PersonaDTO persona) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional: Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);//una vez pasada la sentencia, vamos a ir cambiando los parámetros

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            registros = stmt.executeUpdate(); //para que actualice el estado en la base de datos, nos devuelve el número de registros afectados
        }  finally {
            try {
                Conexion.close(stmt);
               Conexion.close(stmt);
                if (this.conexionTransaccional == null) { //si es nulo es que se ha creado una nueva transaccion de este método,  por lo que se tiene que cerrar
                    //si el valor es distinto de nulo, no se cierra
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return registros;
        }
    public int eliminar(PersonaDTO persona) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional: Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);//una vez pasada la sentencia, vamos a ir cambiando los parámetros
            
            stmt.setInt(1, persona.getIdPersona()); //solo necesitamos el valor de idPersona
            registros = stmt.executeUpdate(); //para que actualice el estado en la base de datos, nos devuelve el número de registros afectados
        }  finally {
            try {
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) { //si es nulo es que se ha creado una nueva transaccion de este método,  por lo que se tiene que cerrar
                    //si el valor es distinto de nulo, no se cierra
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return registros;
    }
}


