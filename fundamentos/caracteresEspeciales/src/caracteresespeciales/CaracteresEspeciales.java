/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteresespeciales;

/**
 *
 * @author buleb
 */
public class CaracteresEspeciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre); //quita el espacio en blanco te vuelve una posición, si pones dos te vuelve dos posiciones
        System.out.println("Comilla simple: \'" + nombre + "\'"); //para que salga el nombre entre comillas simples
        System.out.println("Comilla doble: \" " + nombre + " \" ");
    }
    
}
