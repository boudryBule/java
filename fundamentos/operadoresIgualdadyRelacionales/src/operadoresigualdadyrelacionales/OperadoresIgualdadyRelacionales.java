/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresigualdadyrelacionales;

import java.util.Scanner;

/**
 *
 * @author buleb
 */
public class OperadoresIgualdadyRelacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var a = 3;
        var b = 2;
        
        var c = (a==b);
        
        System.out.println("c = " + c);
        
        var d = (a != b);
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var e = cadena == cadena2; //aqui se compara las instancias no el valor
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2); //comparacion de contenido en cadenas
        System.out.println("f = " + f);
        
        //ejercicio numero mayor
        
       
//        System.out.println("Introduce un numero");
//        var consola = new Scanner(System.in);
//        int n1 = Integer.parseInt(consola.nextLine());
//        System.out.println("Introduce otro numero");
//        int n2 = Integer.parseInt(consola.nextLine());
//        
//        if( n1>n2){
//            System.out.println("el numero mas grande es: = " + n1);
//        } else {
//            System.out.println("el numero mas grande es: = " + n2);
//
//        }
//        
        //operadores relacionales
         var g = a > b; // tambien está el operador >=
         System.out.println("g = " + g);
         
        if ( a % 2 == 0) //si se cumple es un numero par
            System.out.println("Es numero par");
        else
            System.out.println("Numero impar");
        
        
        var edad = 30;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
        
        
        
        
    }
    
}
