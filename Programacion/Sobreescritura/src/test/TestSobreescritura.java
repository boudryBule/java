package test;

import domain.*;


public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
        imprimir(gerente);
//        System.out.println("gerente = " + gerente.obtenerDetalles());
    }
    
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles()); //en tiempo de ejecucion el metodo que se va a ejecutar va a ser del tipo de la referencia que reciba
    }
}
