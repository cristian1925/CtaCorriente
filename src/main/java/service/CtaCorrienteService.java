package service;

import model.CtaCorriente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CtaCorrienteRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CtaCorrienteService {

    @Autowired
    private CtaCorrienteRepository ctaCorrienteRepository;

    public CtaCorriente saveCtaCorriente(CtaCorriente ctaCorriente) {
        return ctaCorrienteRepository.save(ctaCorriente);
    }

    public List<CtaCorriente> findAllCtaCorrientes() {
        return ctaCorrienteRepository.findAll();
    }

    public Optional<CtaCorriente> findCtaCorrienteById(Long id) {
        return ctaCorrienteRepository.findById(id);
    }

    public void deleteCtaCorriente(Long id) {
        ctaCorrienteRepository.deleteById(id);
    }
}

