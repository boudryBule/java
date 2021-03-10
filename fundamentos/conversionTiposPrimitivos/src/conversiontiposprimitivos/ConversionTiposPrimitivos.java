/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author buleb
 */
public class ConversionTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conversion tipo string a tipo int
        var edad = Integer.parseInt("20");
        System.out.println(edad + 1);
        
        //conversion tipo int a double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //pedir un valor
        
        var consola = new Scanner(System.in);
        System.out.println("Introduce un valor: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        //tipo int a tipo string
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //de string a char
        var caracter = "hola".charAt(0); //con el chartAt te devuelve el caracter de la posición que le pases
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    
    }
    
}
