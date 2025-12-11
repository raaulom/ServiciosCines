package org.example.controller;

import org.example.model.Entradas;
import org.example.service.EntradasServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entradas")
public class EntradasController {

    private final EntradasServices entradasService;

    public EntradasController(EntradasServices entradasService) {
        this.entradasService = entradasService;
    }

    @PostMapping("/comprar")
    public Entradas comprar(@RequestParam int idProyeccion,
                            @RequestParam String asiento,
                            @RequestParam double precio,
                            @RequestParam String metodoPago) {
        return entradasService.comprarEntrada(idProyeccion, asiento, precio, metodoPago);
    }

    @PostMapping("/devolver/{idEntrada}")
    public Entradas devolver(@PathVariable int idEntrada) {
        return entradasService.devolverEntrada(idEntrada);
    }

    @GetMapping
    public List<Entradas> listar() {
        return entradasService.listar();
    }

    @GetMapping("/{id}")
    public Entradas obtener(@PathVariable int id) {
        return entradasService.obtenerPorId(id);
    }
}

