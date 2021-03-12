
package operaciones;

public class Aritmetica {
    //atributos de la clase
    int a;
    int b;
    
    //constructor vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica(int a, int b) { //en los constructores no puedes usar var en los argumentos
       this.a = a; //el argumento que recibimos en el metodo lo asignamos al atributo de nuestra clase
        this.b = b;
        System.out.println("Constructor con argumentos");
    }
    
    
    //metodo
    public void sumar() {
        int resultado = a+ b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno() {
//        int resultado = a + b;
//        return resultado;
        return a + b;
    } 
    
//    public int sumarConArgumentos(int arg1, int arg2) { //aqui son argumentos
//        a = arg1;
//        b = arg2;        
////        return a + b;
//        return sumarConRetorno();
    
    //this hace referencia al atributo de nuestra clase que se está ejecutando en ese justo momento
        public int sumarConArgumentos(int a, int b) { //aqui son argumentos
        this.a = a; //el argumento a se le asigna al atributo this.a
        this.b = b;        
//        return a + b;
        return this.sumarConRetorno();
    }
}
