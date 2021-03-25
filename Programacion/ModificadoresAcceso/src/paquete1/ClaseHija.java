//ya podríamos hacer uso de la claseHija ya que está en el pauqete1 junto a la clase1
package paquete1;




public class ClaseHija extends Clase1 {
    
    public ClaseHija() {
       super("Publico"); //desde la clase hija a lo unico que podemos acceder es al constructor publico
       // this.atributoPrivado = "Modificacion atributo default"; no podemos acceder al atributo porque es privado de la clase 1
//        System.out.println("atributodefault = " + this.atributoDefault);
        //this.metodoPrivado();
    }
}
