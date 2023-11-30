package service;

import model.Transaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TransaccionRepository;
import java.util.List;
import java.util.Optional;

@Service
public class TransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;

    public Transaccion saveTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public List<Transaccion> findAllTransacciones() {
        return transaccionRepository.findAll();
    }

    public Optional<Transaccion> findTransaccionById(Long id) {
        return transaccionRepository.findById(id);
    }

    public void deleteTransaccion(Long id) {
        transaccionRepository.deleteById(id);
    }
}

