package com.gm.HolaMundo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //para que spring reconozca esta clase
@Slf4j //para usar el log
public class ControladorInicio {
    
    @GetMapping("/") //mapeamos a un path  para indicarle al navegador que es el método que se tiene que ejecutar
   
    public String inicio() {
        log.info("Ejecutando el controlador rest ");
        return "Hola Mundo con spring 2 buenas tarde";
    }
}