package com.gm.HolaMundo.servicio;

import com.gm.HolaMundo.dao.IPersonaDao;
import com.gm.HolaMundo.domain.Persona;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //para que spring lo reconozca como clase de servicio
public class PersonaServiceImp implements PersonaService{

    @Autowired //Para poder inyectarlo
    private IPersonaDao personaDao; //vamos a conectar nuestra capa de servicio con nuestra capa de datos con la variable personaDao
    
    
    @Override
    @Transactional(readOnly = true) //para que en caso de error haga un rollback y en caso de que salga bien, que haga un commit de todo
    public List<Persona> listarPersonas() {
       
        return (List<Persona>) personaDao.findAll(); //es necesario hacerle un cast porque findAll devuelve un tipo object
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
        
    }

    @Override
    @Transactional(readOnly=true)
    public Persona encontrarPersona(Persona persona) {
       return  personaDao.findById(persona.getIdPersona()).orElse(null); //en caso de que no encuentre lo que buscamos, devolverá null
    }
     
}
