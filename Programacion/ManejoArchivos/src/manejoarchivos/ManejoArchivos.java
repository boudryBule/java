
package manejoarchivos;

//io significa input output así que es el paquete de entrada salida en java
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;



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
    
    public static void anexarArchivo(String nombreArchivo, String contenido){
        
        
        
        File archivo = new File(nombreArchivo); //así creamos el objeto de tipo file en memoria, pero no lo hemos guardado todavía en el disco duro
        try {
            //no vamos a pasarle la información directamente al objeto printWriter, vamos a usar una clase intermedia para indicar que queremos anexar información al archivo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true )); //si le pasamos el valor true es que queremos anexar la información 
            salida.println(contenido); //asi escribimos en el archivo
            salida.close(); //cuando llamamos al método close es cuando se crea el archivo en el disco duro
            System.out.println("Se ha anexado información al archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out); //imprimimos la excepcion
        } catch (IOException ex) { //excepcion por el FileWriter
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        //por inferencia de tipos, el tipo de archivo que haya en la parte derecha se aplicará a la izquierda
        var archivo = new File(nombreArchivo);
        try {
            //con la función BufferedReader podemos leer lineas completas, con FileReader no
            var entrada = new BufferedReader(new FileReader(archivo)); //abrimos el flujo
            var lectura = entrada.readLine(); //leemos una linea
            while(lectura != null){ //iteramos cada linea de nuestro archivo hasta que encontremos una vacía
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
                entrada.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
 