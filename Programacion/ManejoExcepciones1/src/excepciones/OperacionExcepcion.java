
package excepciones;


//public class OperacionExcepcion extends Exception {
public class OperacionExcepcion extends RuntimeException{ //vamos a probar con RuntimeException
    public OperacionExcepcion(String mensaje) {
        super(mensaje);  //propagamos el mensaje a la clase padre
    }
}
