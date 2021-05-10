package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
//de esta forma nuestro archivo conexion es totalmente reutilizable
public class Conexion {
    private static final  String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    //va a iniciar el objeto de pool de conexiones y  posteriormente usarlo para nuevas conexiones con la base de datos
    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        
        //definimos el tamaño inicial del pool de conexiones
        ds.setInitialSize(5);//debemos de empezar con un tamaño pequeño
        
        return ds;
    }
    
    public static Connection getConnection() throws SQLException{
       // return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); //nos devuelve un objeto de tipo conection así que podemos devolverlo directamente
       //haciendo uso del pool de conexiones cambia el return 
       return getDataSource().getConnection(); //como todo está configurado no hay que pasarle ningún valor, solo llamar a getConnection para solicitar un objeto conexion del pool
    }
    
    //vamos a crear los distintos métodos para cerrar todas las conexiones que tenemos en el TestMySqlJDBC.java
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{ //cuando trabajamos con statement normalmente trabajamos tambien con prepared statement
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
