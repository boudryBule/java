
package peliculas.servicio;

import java.util.logging.Level;
import java.util.logging.Logger;
import peliculas.datos.AccesoDatosImpl;
import peliculas.datos.IAccesoDatos;
import peliculas.domain.Pelicula;
import peliculas.excepciones.AccesoDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }
    
    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula); //convertimos el string a tipo película
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO); //vamos a comprobar si el archivo está vacío o no
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
        
    }

    @Override
    public void listarPeliculas() {
        
    }

    @Override
    public void buscarPelicula(String buscar) {
        
    }

    @Override
    public void iniciarCatalogoPeliculas() {
       
    }
    
}
