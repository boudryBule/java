package test;

//instance of nos permite identificar el tipo pero en tiempo de ejecucion
import domain.*;


public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
    }
    
    
    public static void determinarTipo(Empleado empleado){
        
        //preguntamos de menos generico a mas generico
        if(empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
        }
        else if ( empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo object");
        }
    }
}
