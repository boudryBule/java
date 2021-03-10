/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipochar;

/**
 *
 * @author buleb
 */
public class TipoChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char miCaracter =  'a'; //almacena solo un caracter para ello usamos comillas simples
        System.out.println("miCaracter = " + miCaracter);
        
        //al poner el diagonal u estás indicando que vas a asginar un valor con el codigo unicode
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        
        
        var miCaracter1 =  'a'; //almacena solo un caracter para ello usamos comillas simples
        System.out.println("miCaracter = " + miCaracter1);
        
        //al poner el diagonal u estás indicando que vas a asginar un valor con el codigo unicode
        var varChar2 = '\u0021';
        System.out.println("varChar = " + varChar2);
        
        var varCharDecimal3 = 33;
        System.out.println("varCharDecimal = " + varCharDecimal3);
        
        
        var varCharSimbolo4 = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo4);
        
        int variableEnteraSimbolo = '!'; //se convierte de forma automatica a su valor decimal
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
    }
    
}
