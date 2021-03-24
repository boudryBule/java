package test;

import paquete1.Clase1;
import paquete2.ClaseHija;


public class TestModificadoresAcceso {
    public static void main(String[] args) {
       // Clase1 clase1 = new Clase1(); no se puede usar el constructor al ser protected
       //Clase1 clase1 = new Clase1("Publico");
       //todo lo que sea protegido no permite ser usado desde otra clase
        //System.out.println("clase1 = " + clase1.atributoProtected);
        //clase1.metodoProtected();
        
        
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
    }
    
}
