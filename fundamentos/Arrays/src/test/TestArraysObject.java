
package test;

import domain.Persona;


public class TestArraysObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0]  = new Persona("Juan");
        personas[1] = new Persona("Karla");
        
        System.out.println("Personas 0  = " + personas[0]); 
        System.out.println("Personas 1  = " + personas[1]);
    }
}
