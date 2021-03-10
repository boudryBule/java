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
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
     }
    
}
