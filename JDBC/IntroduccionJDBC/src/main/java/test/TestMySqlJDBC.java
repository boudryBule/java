package test;
public class TestMySqlJDBC {
    public static void main(String[] args) {
        
        //para conectarnos a la BBDD de mysql tenemos que realizar ditintos pasos
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true"; //ponemos localhost porque es ip local, si no ponemos la que estemos usando
                                                                       //useSSL quiere indicar que no vamos a usar el puerto seguro
                                                                       //allowPublicKeyRetrieval para que nos podamos conectar de forma exitosa
    }                       
}
