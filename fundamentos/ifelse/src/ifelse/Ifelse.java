/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

/**
 *
 * @author buleb
 */
public class Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var condicion = true;
        if(condicion){
            System.out.println("Condicion verdadera");
        }else{
            System.out.println("Condicion falsa");
        }
        
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        
        if (numero == 1){
            numeroTexto = "Numero uno";
        }else if (numero ==2){
            numeroTexto = "Numero dos";
        } else if(numero ==3) {
            numeroTexto = "Numero tres";
        } else if (numero ==4){
            numeroTexto = "Numero cuatro";
        } else{
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
        
    }
    
}
