package com.gm.HolaMundo;

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
    
    @Value("${index.saludo}") //para poder acceder al mensaje en application.properties
    private String saludo;
    
    
    
    //la configuración con MVC es muy parecida, seguimos usando el getMapping
    @GetMapping("/") //mapeamos a un path  para indicarle al navegador que es el método que se tiene que ejecutar
    public String inicio(Model model) { //con model vamos a agregar la información que queremos compartir con nuestra vista
        var mensaje = "Hola mundo con thymeleaf";
        
        
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("554488");
        
        var persona2 = new Persona();
        persona2.setNombre("Carla");
        persona2.setApellido("Gomez");
        persona2.setEmail("cgomez@mail.com");
        persona2.setTelefono("112233");
        
//        List<Persona> personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);
        
//        también puede añadirse así: 

        var personas = Arrays.asList(persona, persona2);
        
        
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje); //compartimos la llave y el valor de la variable mensaje
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas); //vamos a compartir la lista de objetos de tipo persona
        return "index";
    }
}           