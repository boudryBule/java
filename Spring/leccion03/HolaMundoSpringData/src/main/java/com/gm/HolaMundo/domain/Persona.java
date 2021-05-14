package com.gm.HolaMundo.domain;



import lombok.Data;


@Data //con lombok ya tendríamos todos los get y set, constructores, metodo iquals, metodo hashcode y toString
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
