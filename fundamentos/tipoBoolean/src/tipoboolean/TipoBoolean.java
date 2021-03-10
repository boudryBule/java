/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoboolean;

/**
 *
 * @author buleb
 */
public class TipoBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
    
        if(varBoolean == true){
              System.out.println("La bandera es verdadera");
        } else{
            System.out.println("La bandera es falsa");
        }
        
        var edad= 30;
        //var esAdulto = edad >=18; //esto devuelve true o false
        if (edad >=18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
    
}
