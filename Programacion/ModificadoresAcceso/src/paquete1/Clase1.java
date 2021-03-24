package paquete1;


public class Clase1 {
//    public String atributoPublico = "Valor atributo publico";
//    
//    public Clase1(){
//        System.out.println("Constructor publico");
//    }
//    
//    public void metodoPublico() {
//        System.out.println("Metodo publico");
//    }
    
    
    //es recomendable que los marquemos como protected si los vamos a heredar a las clases hijas y si no queremos heredar lo ponemos como privado
    protected String atributoProtected = "Valor atributo protected";
    protected Clase1(){ //solo lo podemos usar desde clases hijas
        System.out.println("Constructor protected");
    }
    
    public Clase1(String arg) {
        System.out.println("Constructor publico");
    }
    
    protected void metodoProtected() {
        System.out.println("Metodo protected");
    }
}
