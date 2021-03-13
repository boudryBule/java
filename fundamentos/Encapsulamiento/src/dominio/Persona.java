
package dominio;

public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    //get para recuperar la informacion
    public String getNombre(){
       return this.nombre;
    }
    
    //modificadores (setters)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    //para los booleanos se usa is en vez de get
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(){
        this.eliminado = eliminado;
    }
    
    
    
}
