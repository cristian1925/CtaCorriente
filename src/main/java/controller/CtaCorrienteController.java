package controller;

import model.CtaCorriente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CtaCorrienteService;

@RestController
@RequestMapping("/ctacorriente")
public class CtaCorrienteController {
    @Autowired
    private CtaCorrienteService ctacorrienteService;

    @PostMapping
    public CtaCorriente addUsuario(@RequestBody CtaCorriente ctacorriente) {
        return ctacorrienteService.saveCtaCorriente(ctacorriente);
    }

    
}

