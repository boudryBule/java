/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author buleb
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=3,b=2;
        var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);
        
        resultado = a-b;
        System.out.println("resultado de la resta = " + resultado);
        
        resultado = a*b;
        System.out.println("resultado de la multiplicacion= " + resultado);
        
        var resultado2 = 3.0/ b; //si no lo pones como double lo que es la cuenta, al hacer la division te da un numero entero 
        System.out.println("resultado de la division = " + resultado2);
        
        resultado = a% b; //operador modulo -> te da el resto de la division
        System.out.println("resultado = " + resultado);
        
        
        //saber si un numero es par o impar
        if(a % 2 ==0){ 
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    
}
