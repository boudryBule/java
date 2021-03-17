package domain;

public class Empleado extends Persona { //así indicas que hereda de Persona
      private int idEmpleado;
      private double sueldo;
      private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
       // super(nombre); //para poner un atributo de una clase de la que heredas tienes que usar super
        //this.idEmpleado = ++Empleado.contadorEmpleado; //le ponemos el Empleado. para saber que es una variable estática
        this(); //asi llamamos al constructor vacio
        this.nombre= nombre; //no podemos usar super al llamar a this, pero al ser los atributos de la clase Persona protected, se puden llamar aquí
        this.sueldo = sueldo;
    }
    
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    
///  el metodo set de idempleado no lo vamos a usar asi que lo quitamos ya que el constructor es el que se va a encargar de asignar este valor
//    public void setIdEmpleado(int idEmpleado) {
//        this.idEmpleado = idEmpleado;
//    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;
    }

    //este es el metodo tostring cuando le das a que use stringbuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
      
    
      
}
