
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
       // miVariable = 5; no te permite cambiar el valor a una variable que es final
       
       
      // Persona.MI_CONSTANTE  = 5; no lo permite porque es final
        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);
        
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); no podemos hacer esto al ser un objeto de tipo final
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre= " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre= " + persona1.getNombre());
        //si podemos cambiar el nombre de la persona aunque sea final pero lo que no podemos es volver a asignar un objeto a la variable
    }
}
