/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorescondicionales;

/**
 *
 * @author buleb
 */
public class OperadoresCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        //operador and &&
        var resultado = a >= 0 && a<=10;
        
        if(resultado){
            System.out.println("Dentro de rango");
        } else{
            System.out.println("Fuera de rango");
        }
        
        //operador or ||
        
        var vacaciones = false;
        var diaDescanso = true;
        
        if(vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego de su hijo");
        }else{
            System.out.println("El padre está ocupado");
        }
        
        
    }
    
}
