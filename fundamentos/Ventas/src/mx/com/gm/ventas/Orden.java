
package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos; //no es estatica porque queremos saber cuantos productos se han añadido al objeto en concreto de tipo orden 
    private static final int MAX_PRODUCTOS = 10; //al ser una constante va en mayusculas
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes; 
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; //inicializamos el array de productos
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
            productos[contadorProductos++] = producto; //es un post incremento, se va a incrementar despues de que se asocie el elemento
        } else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

}
