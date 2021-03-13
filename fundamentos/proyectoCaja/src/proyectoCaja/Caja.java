
package proyectoCaja;


public class Caja {
    
    int ancho;
    int alto;
    int profundo;
    
    Caja() {
        System.out.println("Constructor vacío");
    }
    
    Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public void calcularVolumen(){
        
        int resultado = ancho * alto * profundo;
        System.out.println("resultado = " + resultado);
    }
}
