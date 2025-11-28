package org.example.service;

import org.example.model.peliculas;
import org.example.repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculasServices {

    @Autowired
    private PeliculasRepository peliculasRepository;

    // INSERTAR
    public peliculas insertarPelicula(peliculas p) {
        return peliculasRepository.save(p);
    }

    // LISTAR TODAS
    public List<peliculas> listarPeliculas() {
        return peliculasRepository.findAll();
    }

    // BUSCAR POR ID
    public Optional<peliculas> buscarPorId(int id) {
        return peliculasRepository.findById(id);
    }

    // ACTUALIZAR
    public peliculas actualizarPelicula(peliculas p) {
        return peliculasRepository.save(p);
    }

    // ELIMINAR
    public void eliminarPelicula(int id) {
        peliculasRepository.deleteById(id);
    }
}
