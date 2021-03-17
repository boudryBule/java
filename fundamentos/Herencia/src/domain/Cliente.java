
package domain;

import java.util.Date;

public class Cliente extends Persona {

 
    private Date fechaRegistro;
    private  int idCliente;
    private static int contadorCliente;
    private boolean vip;
    
    
    
    public Cliente(boolean vip, Date fechaRegistro, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);//super tiene que ser lo primero que pones en el constructor 
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = true;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{fechaRegistro=").append(fechaRegistro);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
   
    


    
    
}
