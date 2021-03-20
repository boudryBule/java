
package test;

import domain.Persona;


public class TestArraysObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0]  = new Persona("Juan");
        personas[1] = new Persona("Karla");
        
        System.out.println("Personas 0  = " + personas[0]); 
        System.out.println("Personas 1  = " + personas[1]);
        
        for(int i=0; i< personas.length; i++) {
            System.out.println(personas[i]);
        }
        
        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas= " + frutas[i]);
        }
    }
}
