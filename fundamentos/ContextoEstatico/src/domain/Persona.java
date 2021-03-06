
package domain;

public class Persona {


    private int idPersona;
    private String nombre;
    private static int contadorPersonas; //se ira incrementando con cada objeto que se cree
    
    
    
    public Persona(String nombre) {
        this.nombre  = nombre;
        //incrementamos el contador por cada objeto nuevo
        //this.contadorPersonas++; al ser static no se recomienda usar this
        Persona.contadorPersonas++; //al ser static es bueno que pongamos Persona.
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override //esta nota está indicando que estamos sobreescribiendo el metodo tostring
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}
