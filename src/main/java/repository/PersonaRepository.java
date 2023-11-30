package repository;

import model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, String> {

   
    Optional<Persona> findByNombrePersona(String nombrePersona);

   
}