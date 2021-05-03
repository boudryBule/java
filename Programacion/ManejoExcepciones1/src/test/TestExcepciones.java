
package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        
        int resultado = 0;
        
        //Atry{
            resultado = division(10, 0);
//        }catch(Exception e) {
//            System.out.println("Ocurrió un ");
//            e.printStackTrace(System.out);//imprimimos la pila de excepciones
//            System.out.println(e.getMessage()); //asi obtendríamos solo el mensaje de la excepcion sin ver toda la pila de excepciones
//        }
            System.out.println("resultado = " + resultado);
    }
}
