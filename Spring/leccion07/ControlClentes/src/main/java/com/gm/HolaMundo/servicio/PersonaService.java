package com.gm.HolaMundo.servicio;

import com.gm.HolaMundo.domain.Persona;
import java.util.List;

public interface PersonaService {
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
