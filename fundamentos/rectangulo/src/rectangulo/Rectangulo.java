/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author buleb
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce el largo del rectangulo: ");
        var consola = new Scanner(System.in);
        int largo = Integer.parseInt(consola.nextLine());
        System.out.println("largo = " + largo);
        System.out.println("Introduce el ancho del rectangulo: ");
        int ancho = Integer.parseInt(consola.nextLine());
        System.out.println("ancho = " + ancho);
         
        System.out.println("El area del rectangulo es: " + (largo * ancho));
        System.out.println("El perimetro del rectangulo es: " + ((largo *2)+(ancho *2)));
    }
    
}
