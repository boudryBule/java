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
        
        inicio: //etiqueta que marca donde debes de ir NO RECOMENDABLE SU USO
         for (var contador = 0; contador < 3; contador++) { //la variable contador al ser creada dentro del bucle for no se puede usar fuera
            if (contador % 2 != 0) {
                
               continue inicio; //hacemos que vaya a la siguiente iteración ESTO ES SIN EL INICIO
            
            }
                System.out.println("contador = " + contador);
         }
        
        
        
//        for(var contador = 0; contador < 3; contador++) { //la variable contador al ser creada dentro del bucle for no se puede usar fuera
//            if(contador %2 == 0){
//                System.out.println("contador = " + contador);
//                break; //hacemos que en cuanto un numero sea par, termine la ejecución
//            }
//        }
        
        
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
