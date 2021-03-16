
package pruebacaja;

import java.util.Scanner;

public class Hostel {
    public static void main(String[] args) {
        
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        int numClientes;
        int numCamas;
        Cama [] arrayCamas;
        
        
        System.out.println("Introduce numero de clientes: ");
        numClientes = Integer.parseInt(sc.nextLine());
        
        System.out.println("Introduce numero de camas: ");
        numCamas = Integer.parseInt(sc.nextLine());
        arrayCamas = new Cama[numCamas];
        for(int i=0; i<numCamas; i++){
            arrayCamas[i] = new Cama( );
        }
        
        for(int i=0 ; i<numClientes; i++){
            System.out.println("Introduce hora de entrada: ");
            int horaEntrada = Integer.parseInt(sc.nextLine());
            
            System.out.println("Introduce hora de salida: ");
            int horaSalida = Integer.parseInt(sc.nextLine());
            
            
            for(int j=0; j<numCamas;j++){
//                if(arrayCamas[j].horaEntrada >= horaSalida || arrayCamas[j].horaSalida <= horaEntrada){
//                    arrayCamas[j].horaEntrada = horaEntrada;
//                    arrayCamas[j].horaSalida = horaSalida;
//                    contador++;
//                    break;

                boolean isValid = true;
                for(int k=0; k<arrayCamas[j].listaReservas.size();k++){
                 
                    if(arrayCamas[j].listaReservas.get(k).horaEntrada < horaSalida || arrayCamas[j].listaReservas.get(k).horaSalida > horaEntrada){
                        isValid = false;
                        break;
                        
                    }
                    
                }
                if(isValid){
                   
                    Reserva reserva = new Reserva(horaEntrada, horaSalida);
                    arrayCamas[j].listaReservas.add(reserva);
                    contador++;
                    break;
                }
                
                       
                       
            }
                    
            
            
            
            System.out.println("contador = " + contador);
        }
    }
}
