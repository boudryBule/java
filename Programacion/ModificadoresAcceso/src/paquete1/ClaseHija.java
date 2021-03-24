//ya podríamos hacer uso de la claseHija ya que está en el pauqete1 junto a la clase1
package paquete1;

import paquete1.Clase1;


public class ClaseHija extends Clase1 {
    
    public ClaseHija() {
        super();
        this.atributoDefault = "Modificacion atributo default";
        System.out.println("atributodefault = " + this.atributoDefault);
        this.metodoDefault();
    }
}
