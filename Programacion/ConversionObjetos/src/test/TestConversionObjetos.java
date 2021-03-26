package test;

import domain.*;


public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO); //podemos asignar referencias de objetos de clases hijas hacia tipos de la clase padre 
        //System.out.println("empleado = " + empleado);
        
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        
        //empleado.getTipoEscritura(); este metoido solo está en la clase escritor, no esta definido en el tipo empleado por tanto llamarlo desde empleado no es posible
        
        
        //para poderlo llamar necesitamos hacer conversion de objetos
        ((Escritor)empleado).getTipoEscritura(); //estamos convirtiendo una referencia de un tipo padre hacia una de tipo hijo (downcasting)
        //lo mismo en dos lineas
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //asignar una variable de tipo hija hacia una de tipo padre (upcasging)
        Empleado empleado2 = escritor; //no necesita de una converison explicita
        System.out.println(empleado2.obtenerDetalles());
    }
}
