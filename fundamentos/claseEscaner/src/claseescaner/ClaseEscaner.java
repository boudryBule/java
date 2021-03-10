/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseescaner;

import java.util.Scanner;

/**
 *
 * @author buleb
 */
public class ClaseEscaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in); //para leer informacion escrita por la consola  
        var usuario = consola.nextLine(); //nextline lee una linea completa de la consola
        System.out.println("usuario = " + usuario);
        System.out.println("Introduce el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
       
    }
    
}
