
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        
        int resultado = 0;
        
        try{
            resultado = division(10, 0);
        
        }catch (OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
          
        }catch(Exception e) {
            System.out.println("Ocurrió un error de tipo Exception ");
            e.printStackTrace(System.out);//imprimimos la pila de excepciones
            System.out.println(e.getMessage()); //asi obtendríamos solo el mensaje de la excepcion sin ver toda la pila de excepciones
        }
        finally{ //finally hace que se ejecute esta parte si o si haya o no una excepcion
            System.out.println("Se revisó la división entre cero");
        }
            System.out.println("resultado = " + resultado);
    }
}
