
package clases;


public class pruebaPersona {
    //psvm y te escribe lo del main
    public static void main(String[] args) {
        Persona persona1= new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        
        persona2.desplegarInformacion();
        persona2.nombre = "Pepe";
        persona2.apellido ="Viyuela";
        persona2.desplegarInformacion();
    }
}
