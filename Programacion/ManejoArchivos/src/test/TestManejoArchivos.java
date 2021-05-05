
package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;


public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
                        // "c:\\carpeta\\prueba.txt" doble diagonal en windows ya que  la primera diagonal es para escapar el siguiente caracter de diagonal
        
        crearArchivo(nombreArchivo);
    }
}
