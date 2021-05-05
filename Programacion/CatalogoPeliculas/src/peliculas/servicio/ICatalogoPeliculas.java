
package peliculas.servicio;

public interface ICatalogoPeliculas { //esta interfaz va a tener los métodos que finalmente va a utilizar el usuario
    
    String NOMBRE_RECURSO = "peliculas.txt"; 
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
}
