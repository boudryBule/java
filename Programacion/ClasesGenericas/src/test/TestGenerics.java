
package test;

import genericos.ClaseGenerica;


public class TestGenerics {
    public static void main(String[] args) {
        //ponemos integer y no int porque tenemos que usar la clase envolvente equivalente del objeto
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        
       objetoString.obtenerTipo();
    }
}
