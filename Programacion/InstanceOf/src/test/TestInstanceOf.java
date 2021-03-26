package test;

//instance of nos permite identificar el tipo pero en tiempo de ejecucion
import domain.*;


public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        //determinarTipo(empleado);
    }
    
    
    public static void determinarTipo(Empleado empleado){
        
        //preguntamos de menos generico a mas generico
        if(empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente) empleado; //asi comvertimos empleado al tipo Gerente
            gerente.getDepartamento(); //ya si podriamos acceder al atributo departamento
            System.out.println("gerente = " + gerente.getDepartamento());
            
        }
        else if ( empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
            //Gerente gerente = (Gerente) empleado;
           // System.out.println("gerente = " + gerente.getDepartamento()); da error
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo object");
            empleado.toString(); //al ser de tipo object, solo tenemos acceso a loso metodos del tipo object
        }
    }
}
