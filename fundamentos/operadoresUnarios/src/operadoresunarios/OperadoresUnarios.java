/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresunarios;

/**
 *
 * @author buleb
 */
public class OperadoresUnarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 3;
        int b=  -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        // 1. preincremento (simbolo antes de la variable)
        
        var e = 3;
        var f = ++e; //primero incrementa la variable y despues usa el valor
        System.out.println("e = " + e); //imprime 4
        System.out.println("f = " + f); //imprime 4
        
        // 2. postincremento (simbolo despues de la variable)
        
        var g = 5;
        var h = g++; //primero se utiliza el valor de la variable y despues se incrementa
        System.out.println("g = " + g); //teniamos pendiente un incremento imprime 6
        System.out.println("h = " + h);// imrpime 5
        
        //decremento
        //predecremento
        var i = 2;
        var j= --i;
        System.out.println("i = " + i);//imprime 1
        System.out.println("j = " + j); //imprime 1
        
        //postdecremento
        var k=4;
        var l= k--;
        System.out.println("k = " + k); //imprime 3
        System.out.println("l = " + l); //imprime 4
    }
    
}
