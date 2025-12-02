package org.example.controller;

import org.example.model.peliculas;
import org.example.service.PeliculasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peliculas")
public class PeliculasController {

    @Autowired
    private PeliculasServices peliculasServices;

    // LISTAR TODAS
    @GetMapping
    public List<peliculas> listarPeliculas() {
        return peliculasServices.listarPeliculas();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Optional<peliculas> buscarPorId(@PathVariable int id) {
        return peliculasServices.buscarPorId(id);
    }

    // INSERTAR
    @PostMapping
    public peliculas insertarPelicula(@RequestBody peliculas p) {
        return peliculasServices.insertarPelicula(p);
    }

    // ACTUALIZAR
    @PutMapping
    public peliculas actualizarPelicula(@RequestBody peliculas p) {
        return peliculasServices.actualizarPelicula(p);
    }

    // ELIMINAR
    @DeleteMapping("/{id}")
    public void eliminarPelicula(@PathVariable int id) {
        peliculasServices.eliminarPelicula(id);
    }
}

