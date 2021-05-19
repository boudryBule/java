package com.gm.HolaMundo.dao;

//para crear nuestra clase de repositorio tenemos que extender la interfaz a CrudRepository

import com.gm.HolaMundo.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona, Long>{
    
}
