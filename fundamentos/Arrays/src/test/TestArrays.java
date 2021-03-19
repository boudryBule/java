
package test;


public class TestArrays {
    public static void main(String[] args) {
        int edades [] = new int[3];
        System.out.println("edades = " + edades);
        
        //vamos a acceder a cada elemento del array para modificarlo
        edades[0] = 10;
        System.out.println("edades 0  = " +  edades[0] );
        
       //edades[3] = 5; da error de ejucion pero no de compilacion, no podemos acceder a un valor del array que esta fuera del dominio
         
       for(int i = 0;i< edades.length; i++) {
           System.out.println("Edades elemento" + i + ": " + edades[i]);
       }
    }
}
