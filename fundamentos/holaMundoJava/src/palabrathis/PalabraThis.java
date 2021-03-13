
package palabrathis;


public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre= " + persona.nombre);
    } 
}

//todas las clases que se añadan de mas no pueden ser publicas 

class Persona {
    String nombre;
    String apellido; 
    
    
    Persona(String nombre, String apellido) {
        //super(); llamada al constructor de la clase Padre (object) 
         this.nombre = nombre;
         this.apellido = apellido;
         
         System.out.println("Clase persona: " + this);
         new Imprimir().imprimir(this);
    }
}


class Imprimir{
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir = " + persona);
        System.out.println("Impresion del objeto actual (this)" +this);
    }
}