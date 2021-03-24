package test;


public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        for(int edad: edades) { //la variable tiene que ser del mismo tipo que los datos del array, luego pones el nombre del array a recorrer
            System.out.println("edad = " + edad);
            //si queremos imprimir el indice que estamos recorriendo tenemos que usar el bucle for
        }
    }
}
