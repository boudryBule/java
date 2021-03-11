/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacalificaciones;

import java.util.Scanner;

/**
 *
 * @author buleb
 */
public class SistemaCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var consola = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        int nota = Integer.parseInt(consola.nextLine());
        if (nota >=9 && nota <=10){
            System.out.println("A");
        }
        if (nota >=8 && nota <9){
            System.out.println("B");
        }
        if (nota >=7 && nota <8){
            System.out.println("C");
        }
        if (nota >=6 && nota <7){
            System.out.println("D");
        }
        if (nota >=0 && nota <6){
            System.out.println("F");
        }
        
        
    }
    
}
