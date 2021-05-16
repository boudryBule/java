package com.gm.HolaMundo.domain;

//vamos a convertir esta clase de persona en una clase de entidad

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import lombok.Data;
import javax.validation.constraints.NotEmpty;


@Data //con lombok ya tendríamos todos los get y set, constructores, metodo iquals, metodo hashcode y toString
@Entity //con esto convertimos la clase en entidad
@Table(name = "persona") //para especificar el nombre tal cual se muestra en la tabla, ya que la clase Persona va con la P mayuscula y la tabla no 
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L; //con esto nuestra clase de identidad ya está implementando  la interfaz de serializable
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty //asi hacemos que la cadena nombre no pueda estar vacía
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty
    @Email
    private String email;
    
    
    private String telefono;
}
