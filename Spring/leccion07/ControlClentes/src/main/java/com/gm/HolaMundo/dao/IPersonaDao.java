package com.gm.HolaMundo.dao;

//para crear nuestra clase de repositorio tenemos que extender la interfaz a CrudRepository

import com.gm.HolaMundo.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
