
package hostel;

public class cama {

     int horaEntrada;
     int horaSalida;
     List<Reserva> listaReservas;
     
    
    cama ( int horaEntrada, int horaSalida){
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        List<Reserva> listaReservas = new ArrayList<Reserva>();
    }
      
}
