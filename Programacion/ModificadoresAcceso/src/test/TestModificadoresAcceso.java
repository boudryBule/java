package test;

import paquete1.Clase1;


public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1(); //al ser publica la podemos usar para crear objetos desde cualquier otra clase
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
    }
    

}
