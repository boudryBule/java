/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author buleb
 */

//window navegator y podemos ver todo lo que tiene nuestra clase
public class Persona { //para crear una nueva clase, le damos a source packages y le damos a new java class, en este caso lo hemos puesto en el paquete clases
    //atributos de la clase
    public String nombre; //si no le ponemos public no lo podemos usar en otro paquete (esto es una mala pracsis pero bueno)
    public String apellido;
    
    //metodos de la clase
    public  void desplegarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
    
}


