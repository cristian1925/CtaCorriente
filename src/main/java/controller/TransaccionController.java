package controller;

import model.Transaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TransaccionService;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {
    @Autowired
    private TransaccionService transaccionService;

    @PostMapping
    public Transaccion addTransaccion(@RequestBody Transaccion transaccion) {
        return transaccionService.saveTransaccion(transaccion);
    }

    
}
