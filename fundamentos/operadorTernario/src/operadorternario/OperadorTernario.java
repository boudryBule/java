/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author buleb
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //el operador ternario solo se recomienda para acciones sencillas
        //lo que pongas despues del ? es lo que va a hacer en caso de que sea cierto
        //lo que pongas despues de : es lo que va a hacer en caso de que sea falso
        
        var resultado = (1 > 2) ? "verdad" :"falso" ;
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        
        resultado = (numero % 2 ==0) ? "es par" : "es impar";
        System.out.println("resultado = " + resultado);
    }
    
}
