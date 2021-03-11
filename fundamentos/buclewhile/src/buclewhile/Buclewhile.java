/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclewhile;

/**
 *
 * @author buleb
 */
public class Buclewhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //bucle for
        
        for(var contador = 0; contador < 3; contador++) { //la variable contador al ser creada dentro del bucle for no se puede usar fuera
            System.out.println("contador = " + contador);
        }
        
        
        //bucle while
//        var contador = 0;
//        while( contador < 3) {
//            System.out.println("contador = " + contador);
//            contador++;
//        }
//        System.out.println("contador fuera = " + contador);


        //bucle do while -> en este bucle minimo se ejecuta una vez aunque sea falso
        
//        var contador = 0;
//        
//        do{
//            System.out.println("contador = " + contador);
//            contador++;
//        }while (contador <3);

    }
}
