
package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
//        aritmetica1.a = 3;
//        aritmetica1.b = 2;
//        aritmetica1.sumar();
//   
//        var resultado = aritmetica1.sumarConRetorno();
//        System.out.println("resultado = " + resultado);
//        
//        
//        resultado = aritmetica1.sumarConArgumentos(5,8); //aqui son parametros
//        System.out.println("resultado usando argumentos= " + resultado);





        //variables locales
        
        var a = 10;
        var b = 2;
        miMetodo(); 
        
        
        
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
         System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);

    }
    
    public static void miMetodo() {
        //a = 10; //al ser de otro metodo no te permite usarla aqui
        //está fuera del alcance donde fue definida
        System.out.println("Otro metodo");
    }
    
}
 