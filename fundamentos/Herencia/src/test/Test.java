package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1); //aunque no tenemos nada en la clase empleado, al heredar ya tenemos todos los atributos de la clase  Persona
    
        Cliente cliente1 = new Cliente(true, new Date(),"Juan", 'F', 28, "Cualquiera");
        System.out.println("cliente1 = " + cliente1);
    }
}
