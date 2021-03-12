
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
            arrayCamas[i] = new cama();
        }
        
        
        for(int i = 0; i< numClientes; i++){
         
            System.out.println("Introduce hora de entrada");
            int horaEntrada= Integer.parseInt(sc.nextLine());
            
            System.out.println("Introduce hora de salida");
            int horaSalida = Integer.parseInt(sc.nextLine());
            
           // arrayCamas[i] = new cama(horaEntrada, horaSalida);
           for(int j=0; j< numCamas; j++){
//             if(arrayCamas[j].horaEntrada >= horaSalida || arrayCamas[j].horaSalida <= horaEntrada) {
//                 arrayCamas[j].horaEntrada = horaEntrada;
//                 arrayCamas[j].horaSalida = horaSalida;
//                 contador++;
//                 break;
//             }
                boolean isValid = true;
                for(int k=0; k<arrayCamas[j].listaReservas.size(); k++){ //hay que mirar que entre cuando sea 0
                    if(arrayCamas[j].listaReservas.get(k).horaEntrada < horaSalida && arrayCamas[j].listaReservas.get(k).horaSalida > horaEntrada ){ //entrarian las que no hay que aceptar
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

//  System.out.println("Introduce hora de entrada");
//            arrayClientes[i].horaEntrada = Integer.parseInt(sc.nextLine());
//            System.out.println("Introduce hora de salida");
//            arrayClientes[i].horaSalida = Integer.parseInt(sc.nextLine());