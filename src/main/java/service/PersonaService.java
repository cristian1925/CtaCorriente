package service;

import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonaRepository;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> findAllPersonas() {
        return personaRepository.findAll();
    }

    public Optional<Persona> findPersonaByRut(String rut) {
        return personaRepository.findById(rut);
    }

    public void deletePersona(String rut) {
        personaRepository.deleteById(rut);
    }
}

