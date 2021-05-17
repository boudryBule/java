package com.gm.HolaMundo.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name="rol") //para que no falle al mapearlo, ya que la clase java es Rol y la tabla es rol
public class Rol implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id //indicamos que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //Indicamos la generación de la clave primaria, es IDENTITY porque es autoincrementable
    private Long idRol;
    
    @NotEmpty
    private String nombre;
}
