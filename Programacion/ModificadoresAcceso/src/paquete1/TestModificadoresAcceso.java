package paquete1;

import paquete1.Clase1; //hemos pasado la clase testModificadoresAcceso al paquete1 para poder hacer uso del constructor default
import paquete1.ClaseHija;


public class TestModificadoresAcceso {
    public static void main(String[] args) {
       // Clase1 clase1 = new Clase1(); no se puede usar el constructor al ser protected
       //Clase1 clase1 = new Clase1("Publico");
       //todo lo que sea protegido no permite ser usado desde otra clase
        //System.out.println("clase1 = " + clase1.atributoProtected);
        //clase1.metodoProtected();
        
        
//        ClaseHija claseHija = new ClaseHija();
//        System.out.println("claseHija = " + claseHija);

        //podemos hacer todas estas llamadas ya que están en el mismo paquete
        Clase1 clase1 = new Clase1();
        clase1.atributoDefault = "Cambio desde la prueba";
        System.out.println("clase1 atributo default= " + clase1.atributoDefault);
        
        clase1.metodoDefault();
    }
    
}
