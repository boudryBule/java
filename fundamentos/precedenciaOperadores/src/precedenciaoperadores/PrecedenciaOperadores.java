/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precedenciaoperadores;

/**
 *
 * @author buleb
 */
public class PrecedenciaOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //la precedencia de operadores es el orden en el que se van a ejecutar en java
        
        var x = 5;
        var y = 10;
        var z = ++x +y--;
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//6 + 10
    
        var resultado = 4 + 5 * 6/3;
        System.out.println("resultado = " + resultado);
    
    }
    
}
