/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendiendojava;

/**
 *
 * @author buleb
 */
public class AprendiendoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        short numeroShort = (short) 32768; //lo forzamos a que sea short 
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        long NumeroLong = 9223372036854775807L; //si quieres poner el numero completo tienes que ponerle una L al final para que sepa que es un long
        System.out.println("numeroLong = " + NumeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        
        
        //tipos primitivos de tipo flotante: float y double
        
        float numeroFloat = 10.0F; //tienes que ponerle la F para que sepa que es flotante
        System.out.println(numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float .MAX_VALUE);
        
        
        
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double .MAX_VALUE);
        
     
    }
    
}
