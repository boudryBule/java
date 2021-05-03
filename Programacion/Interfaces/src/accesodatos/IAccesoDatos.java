
package accesodatos;


public interface IAccesoDatos {
    int MAX_REGISTRO = 10;
    
    void insertar(); //si le damos ctrl sobre el nombre nos sale que es abstract, lo ha puesto el compilador automáticamente
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
