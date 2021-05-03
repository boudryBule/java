
package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona(); //en javabeans normalmente creamos el objeto con el constructor vacío
        persona.setNombre("Pepe");
        persona.setApellido("Perez");
    
        
        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre: " +persona.getNombre());
        System.out.println("Persona apellido: " +persona.getApellido());
    }
}
