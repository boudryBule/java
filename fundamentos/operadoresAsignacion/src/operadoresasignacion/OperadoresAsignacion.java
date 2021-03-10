/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresasignacion;

/**
 *
 * @author buleb
 */
public class OperadoresAsignacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        //incrementando a en 1 
        //se puede usar cualquier operador para esto
        // *= /= %/
        a +=1;
        System.out.println("a = " + a);
        a -=2;
        System.out.println("a = " + a);
    }
    
}
