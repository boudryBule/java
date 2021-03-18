
package operaciones;

public class Operaciones {
    public static int sumar(int a, int b) {
        System.out.println("sumar(int a, int b)");
        return a + b;
    }
    
    //para la sobrecarga puede cambiar de tipo la funcion pero no puede ser mas restrictivo (no puede ser otra cosa que no sea public en este caso)
    public static double sumar(double a, double b){
        System.out.println("sumar(double a, double b)");
        return a + b;
    }
}
