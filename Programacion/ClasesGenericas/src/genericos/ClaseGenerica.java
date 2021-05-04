
package genericos;


public class ClaseGenerica <T>{ //con la <T> indicamos tipo generico
    private T objeto; //al ser un tipo genérico no sabemos de qué tipo es 
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
