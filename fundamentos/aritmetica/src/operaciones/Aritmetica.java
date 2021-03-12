
package operaciones;

public class Aritmetica {
    //atributos de la clase
    int a;
    int b;
    
    //metodo
    public void sumar() {
        int resultado = a+ b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno() {
//        int resultado = a + b;
//        return resultado;
        return a + b;
    }
}
