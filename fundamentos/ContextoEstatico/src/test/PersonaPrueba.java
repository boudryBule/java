
package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;

    public static void main(String[] args) {
       
        
        Persona persona1 = new Persona("Juan");
        
//        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Karla");
//        System.out.println("persona2 = " + persona2);
        //el contador se va incrementando ya que es static, si no lo fuese todos saldrían con id= 1
        imprimir(persona1);
        imprimir(persona2);
        
       //this.contador = 10; variable no estatica no puede ser referenciada desde un estatico
       
    }
    
    //el metodo imprimir debe de ser estatico, ya que si es dinamico se asocia a los objetos que se vayan a crear en la clase (Personaprueba que no crea nada) por lo que da error
    public static void imprimir( Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador() { //metodo dinamico o asociado a nuestros objetos
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
