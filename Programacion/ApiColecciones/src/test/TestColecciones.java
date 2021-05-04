
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
        
        imprimir(miLista);
        
//           for(Object elemento: miLista) {
//            System.out.println("elemento = " + elemento);
//        }
        
//        //también se podría hacer así 
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        


        //set no añade de forma ordenada, por lo cual es más rápido 
        //en set no se permiten elementos duplicados, por lo que si repetimos un elemento, este no se volverá a mostrar 
        Set miSet = new HashSet();
        
        miSet.add("lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        imprimir(miSet);
        
    }
    
    public static void imprimir(Collection coleccion) { //va a recibir el tipo más genérico, la interfaz collection
        
        for(Object elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
    }
}
