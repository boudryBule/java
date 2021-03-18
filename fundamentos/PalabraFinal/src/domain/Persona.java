package domain;
public final class Persona {
    
    public final static int MI_CONSTANTE = 1; //las variables que son constantes (tienen el final) se ponen en mayusculas
    
    private String nombre;
    
    
    public final void imprimir() { //al ponerle final al metodo, no permite la sobreescritura del mismo como podemos ver en la clase empleado
        System.out.println("Metodo imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
