
package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>(); //de esta forma indicamos el tipo  de dato de la lista, al añadir ya nos indica que es de tipo String y no de tipo object
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //ya no tenemos que hacer la conversión de tipo object al tipo que deseemos
        String elemento = miLista.get(0);
       // System.out.println("elemento = " + elemento);

        
//        imprimir(miLista);
        
//           for(Object elemento: miLista) {
//            System.out.println("elemento = " + elemento);
//        }
        
//        //también se podría hacer así 
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        


        //set no añade de forma ordenada, por lo cual es más rápido 
        //en set no se permiten elementos duplicados, por lo que si repetimos un elemento, este no se volverá a mostrar 
        Set<String> miSet = new HashSet<>(); //set en generic
        
        miSet.add("lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
//        imprimir(miSet);
        
      
      Map<String, String> miMapa = new HashMap<>(); //convertimos el map también en generic, tenemos que poner el tipo de objeto tanto para la llave como para el valor
      miMapa.put("valor1", "juan"); //asociamos el valor juan a la key valor1
      miMapa.put("valor2", "Carla");
      miMapa.put("valor3", "Pepi");
      miMapa.put("valor3", "Carlos"); //al repetirse la llave, se quedará el valor último que se le haya dado a la llave
      
      
      String elementoMapa = miMapa.get("valor1"); //ya no hace falta hacer conversiones debido a que ya no son tipo object, si no tipo string
//     System.out.println("elemento = " + elementoMapa);
      
      imprimir(miMapa.keySet()); //asi imprimimos todos las keys (no sale en orden)
      imprimir(miMapa.values()); //así imprimiría todos los valores
      
    }
    
    public static void imprimir(Collection<String> coleccion) { //le indicamos el tipo de objeto
        
        for(String elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
    }
}
