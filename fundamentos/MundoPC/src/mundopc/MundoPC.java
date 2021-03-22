package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP); 
    
        
        Monitor monitorRazer = new Monitor("Razer", 34);
        Teclado tecladoRazer = new Teclado("USB", "Razer");
        Raton ratonRazer = new Raton("USB", "Razer");
        Computadora computadoraRazer = new Computadora("Computadora Razer", monitorHP, tecladoRazer, ratonRazer); 
        
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraRazer);
        
        orden1.mostrarOrden();
    }
    
}
