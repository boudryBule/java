package com.gm.HolaMundo.web;


import com.gm.HolaMundo.servicio.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //le quitamos el Rest para que sea un controlador de tipo MVC
@Slf4j //para usar el log
public class ControladorInicio {
    
    @Autowired //inyectamos la interfaz personaDao
    private PersonaService personaService;
    
    
    
    //la configuración con MVC es muy parecida, seguimos usando el getMapping
    @GetMapping("/") //mapeamos a un path  para indicarle al navegador que es el método que se tiene que ejecutar
    public String inicio(Model model) { //con model vamos a agregar la información que queremos compartir con nuestra vista
        var personas = personaService.listarPersonas();
        
        
        
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas); 
        return "index";
    }
}           