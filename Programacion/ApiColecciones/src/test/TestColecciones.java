
package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
//           for(Object elemento: miLista) {
//            System.out.println("elemento = " + elemento);
//        }
        
        //también se podría hacer así 
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
        
    }
}
