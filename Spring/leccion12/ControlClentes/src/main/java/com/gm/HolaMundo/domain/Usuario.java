package com.gm.HolaMundo.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name="usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    
    @NotEmpty
    private String username;
    
    @NotEmpty
    private String password;
    
    
    @OneToMany //porque un usuario puede tener varios roles
    @JoinColumn(name="id_usuario") //así indicamos cual es la columna que está relacionando nuestras tablas
    private List<Rol> roles; //para poder recuperar los roles asociados a un usuario
}
