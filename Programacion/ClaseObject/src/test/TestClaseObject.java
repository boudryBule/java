package test;

import domain.Empleado;


public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado ("Juan", 5000);
    
        
        if (empleado1 == empleado2) { //asi preguntamos por la referencia en memoria de los objetos
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        
    }
}
