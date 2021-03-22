package test;

//vargars tambien es como se llaman a los argumentos variables

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", 8, 9, 10);
    }
    
    private static void variosParametros(String nombre, int... numeros){ //si vas a pasarle varios argumentos, el que es variable tiene que ir el ultimo
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
        
    }
    
    private static void imprimirNumeros(int... numeros){ //al poner los puntos suspensivos indicamos que son argumentos variables, no sabemos el numero exacto hasata el momento en el que lo ejecutemos
        //dentro del metodo el int numeros se convierte en un array 
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }
}
