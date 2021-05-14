package com.gm.HolaMundo.domain;

//vamos a convertir esta clase de persona en una clase de entidad

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


@Data //con lombok ya tendríamos todos los get y set, constructores, metodo iquals, metodo hashcode y toString
@Entity //con esto convertimos la clase en entidad
@Table(name = "persona") //para especificar el nombre tal cual se muestra en la tabla, ya que la clase Persona va con la P mayuscula y la tabla no 
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L; //con esto nuestra clase de identidad ya está implementando  la interfaz de serializable
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
