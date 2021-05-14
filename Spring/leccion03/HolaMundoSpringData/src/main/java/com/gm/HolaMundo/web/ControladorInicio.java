package com.gm.HolaMundo.web;

import com.gm.HolaMundo.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //le quitamos el Rest para que sea un controlador de tipo MVC
@Slf4j //para usar el log
public class ControladorInicio {
    
    private String saludo;
    
    
    
    //la configuración con MVC es muy parecida, seguimos usando el getMapping
    @GetMapping("/") //mapeamos a un path  para indicarle al navegador que es el método que se tiene que ejecutar
    public String inicio(Model model) { //con model vamos a agregar la información que queremos compartir con nuestra vista
        
        
        
        
        
        log.info("Ejecutando el controlador Spring MVC");
       // model.addAttribute("personas", personas); //vamos a compartir la lista de objetos de tipo persona
        return "index";
    }
}           