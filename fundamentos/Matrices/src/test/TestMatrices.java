
package test;

import domain.Persona;


public class TestMatrices {
    public static void main(String[] args) {
        //el primer array controla las filas y el segundo las columnas
        int edades[][] = new int[3][2]; //matriz de 3 filas y 2 columnas
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;

        System.out.println("edades 0-0= " + edades[0][0] );
        System.out.println("edades 0-1= " + edades[0][1] );
        
        
//        for(int i = 0; i<edades.length; i++) {
//            for(int j= 0; j<edades[i].length; j++) {
//                System.out.println("edades" + i+ "-" + j + ": " + edades[i][j]);
//            }
//        }
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};
        imprimir(frutas);
   
        
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        imprimir(personas);
    }
    
    
    public static void imprimir(Object matriz[][]){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz" + i + j + ": " + matriz[i][j]);

            }
        }
    }
}
