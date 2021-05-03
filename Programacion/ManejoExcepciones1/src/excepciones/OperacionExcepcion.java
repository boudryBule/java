
package excepciones;


public class OperacionExcepcion extends Exception {
    public OperacionExcepcion(String mensaje) {
        super(mensaje);  //propagamos el mensaje a la clase padre
    }
}
