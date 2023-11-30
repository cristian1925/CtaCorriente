package controller;

import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping
    public Persona addUsuario(@RequestBody Persona persona) {
        return personaService.savePersona(persona);
    }

   
}
