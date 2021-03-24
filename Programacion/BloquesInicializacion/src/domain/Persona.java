package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //bloque de código de inicializacion estatico, se ejecuta la primera vez que se carga en memoria la clase
    static { //se ejecuta antes que el constructor y antes de cualquier bloque de inicializacion no estatico
        System.out.println("Ejecucion bloque estatico");
        //aqui podemos inicializar las variables estaticas
        //al ser un contexto estatico no podemos usar el operador this
        ++Persona.contadorPersonas;
        //idPersona = 10; da error porque una variable no estatica no puede ser referenciada desde un contexto estatico
        
    }
    
    //bloque de inicializacion  no estatico, se ejecuta cada vez que se crea un objeto
    { //se ejecuta antes que el constructor
        
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
}
