package domain;

import java.io.Serializable;

public class Persona implements Serializable{ //para que sea un java bean debe de implementar la interfaz Serializable
    private String nombre;
    private String apellido;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, String apellido){ //este construvtor no es requerido, pero lo creamos para inicializar desde el momento de la creación del objeto los atributos de nuestra clase
    
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    
    
}
