package datos;


import domain.Usuario;
import java.sql.*;
import java.util.*;


public class UsuarioJDBC { //esta clase va a realizar las operaciones de insert, update, delete pero de la tabla usuario

    private static final String SQL_SELECT = "SELECT id_usuario, username, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUES(?, ?)"; //le pasamos ? como parametro en vez de pasarle el username directamente
    private static final String SQL_UPDATE = "UPDATE usuario SET username = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";
    //metodo que va a devolver una lista de objetos de tipo usuario
    public List<Usuario> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            //ya tenemos el resultSet, ahora tenemos que iterar cada uno de los registros para poder crear cada objeto de tipo usuario por cada registro
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String username = rs.getString("username");
                String password = rs.getString("password");
           

                usuario = new Usuario(idUsuario, username, password); //creamos nuestro objeto de tipo usuario usando el constructor con todos los atributos
                //Estamos convirtiendo información de la base de datos en objetos java

                usuarios.add(usuario); //añadimos la usuario a la lista de usuarios
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

        return usuarios;

    }
    
    //el metodo insertar devuelve int porque nos va a mostrar los registros que se han modificado
    public int insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);//una vez pasada la sentencia, vamos a ir cambiando los parámetros
            
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate(); //para que actualice el estado en la base de datos, nos devuelve el número de registros afectados
            System.out.println("registros afectados = " + registros);
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
    
    public int actualizar(Usuario usuario) {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);//una vez pasada la sentencia, vamos a ir cambiando los parámetros

            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
    
            registros = stmt.executeUpdate(); //para que actualice el estado en la base de datos, nos devuelve el número de registros afectados
            System.out.println("registros = " + registros);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return registros;
        }
    public int eliminar(Usuario usuario) {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);//una vez pasada la sentencia, vamos a ir cambiando los parámetros
            
            stmt.setInt(1, usuario.getId_usuario()); //solo necesitamos el valor de idUsuario
            registros = stmt.executeUpdate(); //para que actualice el estado en la base de datos, nos devuelve el número de registros afectados
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
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
