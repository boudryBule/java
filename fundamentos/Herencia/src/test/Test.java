package test;

import domain.Empleado;

public class Test {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        System.out.println("empleado1 = " + empleado1); //aunque no tenemos nada en la clase empleado, al heredar ya tenemos todos los atributos de la clase  Persona
    }
}
