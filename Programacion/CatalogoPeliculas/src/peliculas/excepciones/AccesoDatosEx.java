
package peliculas.excepciones;

public class AccesoDatosEx  extends Exception{
    public AccesoDatosEx(String mensaje){
        super(mensaje); //propagamos el mensaje a la clase padre para su constructor
    }
}
