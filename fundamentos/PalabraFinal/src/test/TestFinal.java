
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
       // miVariable = 5; no te permite cambiar el valor a una variable que es final
       
       
      // Persona.MI_CONSTANTE  = 5; no lo permite porque es final
        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);
    }
}
