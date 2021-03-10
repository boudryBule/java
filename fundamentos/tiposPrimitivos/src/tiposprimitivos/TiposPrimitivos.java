/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author buleb
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Tipos primitivos enteros: byte, short, int, long
        */
        
        byte numeroByte = (byte) 129; //asi lo forzamos a que sea de tipo byte
        System.out.println("valor minimo byte" + Byte.MIN_VALUE);
        System.out.println("valor maximo byte" + Byte.MAX_VALUE);
        System.out.println(numeroByte);
        
        
    }
    
}
