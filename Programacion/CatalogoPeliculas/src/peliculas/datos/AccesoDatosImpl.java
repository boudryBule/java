
package peliculas.datos;

import java.io.*;
import java.util.*;
import peliculas.domain.Pelicula;
import peliculas.excepciones.*;



public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
       var archivo = new File(nombreRecurso);
       List<Pelicula> peliculas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while(linea != null){
                var pelicula = new Pelicula(linea); //vamos creando una lista con cada linea del archivo
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
               entrada.close();
            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
           throw new LecturaDatosEx("Excepcion al listar películas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
           throw new LecturaDatosEx("Excepcion al listar películas: " + ex.getMessage());
        }
        return peliculas;
       
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        
    }
    
}
