
package test;


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
        
        
        for(int i = 0; i<edades.length; i++) {
            for(int j= 0; j<edades[i].length; j++) {
                System.out.println("edades" + i+ "-" + j + ": " + edades[i][j]);
            }
        }
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};
        for(int i=0; i<frutas.length; i++){
            for(int j=0; j< frutas[i].length;j++){
                System.out.println("frutas"+ i + j + ": "+  frutas[i][j]);
                
            }
        }
        
    }
}
