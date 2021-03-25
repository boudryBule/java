package paquete1;


//public class Clase1 {
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
//    protected String atributoProtected = "Valor atributo protected";
//    protected Clase1(){ //solo lo podemos usar desde clases hijas
//        System.out.println("Constructor protected");
//    }
//    
//    public Clase1(String arg) {
//        System.out.println("Constructor publico");
//    }
//    
//    protected void metodoProtected() {
//        System.out.println("Metodo protected");
//    }
    
//    class Clase1 { //con el modificador default o package no puede ser usada fuera de este paquete
//    
//         String atributoDefault = "Valor atributo default";
//
//        Clase1() { 
//            System.out.println("Constructor default");
//        }
//
////        public Clase1(String arg) {
////            System.out.println("Constructor publico");
////        }
//
//        void metodoDefault() {
//            System.out.println("Metodo default");
//        }
        
class Clase1 { //una clase no puede declararse como privada, la dejamos default

   private String atributoPrivado = "Valor atributo privado"; //al ser private ya no se puede modificar su valor desde otras clases sin importar que este en el mismo paquete
   //para poder acceder a este atributo necesitamos los metodos get y set

   private  Clase1() { //el constructor privado solo se puede usar en esta misma clase
        System.out.println("Constructor privado");
    }
   
   public Clase1(String argumento){
       this(); //asi llamamos al constructor privado
       System.out.println("Constructor publico");
   }

//        public Clase1(String arg) {
//            System.out.println("Constructor publico");
//        }
    private void metodoPrivado() {
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}
