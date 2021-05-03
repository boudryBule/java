
package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador) {
            //throws OperacionExcepcion no hace falta al ser RuntimeException
        if ( denominador == 0){
            throw new OperacionExcepcion("Division entre cero");
        }
        
        return numerador / denominador;
    }
}
