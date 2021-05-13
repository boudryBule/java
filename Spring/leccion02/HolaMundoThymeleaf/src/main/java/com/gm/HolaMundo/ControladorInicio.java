package com.gm.HolaMundo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //le quitamos el Rest para que sea un controlador de tipo MVC
@Slf4j //para usar el log
public class ControladorInicio {
    
    //la configuración con MVC es muy parecida, seguimos usando el getMapping
    @GetMapping("/") //mapeamos a un path  para indicarle al navegador que es el método que se tiene que ejecutar
    public String inicio() {
        log.info("Ejecutando el controlador Spring MVC");
        //return "Hola Mundo con spring ";
        //ahora en vez de devolver un mensaje va a devolver la página que queremos que se despliegue en el navegador
        return "index";
    }
}