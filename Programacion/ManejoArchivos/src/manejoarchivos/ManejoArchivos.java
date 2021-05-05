
package manejoarchivos;

//io significa input output así que es el paquete de entrada salida en java
import java.io.*;


public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo); //así creamos el objeto de tipo file en memoria, pero no lo hemos guardado todavía en el disco duro
        try {
            PrintWriter salida = new PrintWriter(archivo); //abrimos el archivo 
            salida.close(); //cuando llamamos al método close es cuando se crea el archivo en el disco duro
            System.out.println("Se ha creado el archivo");
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out); //imprimimos la excepcion
        }
        
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo); //así creamos el objeto de tipo file en memoria, pero no lo hemos guardado todavía en el disco duro
        try {
            PrintWriter salida = new PrintWriter(archivo); //abrimos el archivo 
            salida.println(contenido); //asi escribimos en el archivo
            salida.close(); //cuando llamamos al método close es cuando se crea el archivo en el disco duro
            System.out.println("Se ha escrito al archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out); //imprimimos la excepcion
        }
    }
}
 