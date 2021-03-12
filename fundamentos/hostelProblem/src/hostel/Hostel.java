
package hostel;

import java.util.Scanner;

public class Hostel
{
   
    
    public static void main(String[] args){
        
        int contador = 0;
        cama [] arrayCamas;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce numero de camas: ");
        int numCamas = Integer.parseInt(sc.nextLine());
        
        System.out.println("Introduce numero de clientes: ");
        int numClientes = Integer.parseInt(sc.nextLine());
        
        arrayCamas = new cama[numCamas];
       
        for (int i = 0; i<numCamas; i++){
            arrayCamas[i] = new cama(-1,-1);
        }
        
        for(int i = 0; i< numClientes; i++){
         
            System.out.println("Introduce hora de entrada");
            int horaEntrada= Integer.parseInt(sc.nextLine());
            
            System.out.println("Introduce hora de salida");
            int horaSalida = Integer.parseInt(sc.nextLine());
            
           // arrayCamas[i] = new cama(horaEntrada, horaSalida);
           for(int j=0; j< numCamas; j++){
             if(arrayCamas[j].horaEntrada >= horaSalida || arrayCamas[j].horaSalida <= horaEntrada) {
                 arrayCamas[j].horaEntrada = horaEntrada;
                 arrayCamas[j].horaSalida = horaSalida;
                 contador++;
                 break;
             }
                 
           }
            System.out.println("contador = " + contador);
           
        }
    }
}

//  System.out.println("Introduce hora de entrada");
//            arrayClientes[i].horaEntrada = Integer.parseInt(sc.nextLine());
//            System.out.println("Introduce hora de salida");
//            arrayClientes[i].horaSalida = Integer.parseInt(sc.nextLine());