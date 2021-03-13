
package proyectoCaja;

import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce ancho: ");
        int ancho = Integer.parseInt(sc.nextLine());
        caja1.ancho = ancho;
        
        System.out.println("Introduce alto: ");
        int alto = Integer.parseInt(sc.nextLine());
        caja1.alto = alto;
        
        System.out.println("Introduce profundo: ");
        int profundo = Integer.parseInt(sc.nextLine());
        caja1.profundo = profundo;
        
        
       caja1.calcularVolumen();
                
    }
}
