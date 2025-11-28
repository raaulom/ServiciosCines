package org.example.service;

import org.example.model.proyecciones;
import org.example.repository.ProyeccionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProyeccionesServices {

    @Autowired
    private ProyeccionesRepository proyeccionesRepository;

    // INSERTAR
    public proyecciones insertarProyeccion(proyecciones p) {
        return proyeccionesRepository.save(p);
    }

    // LISTAR TODAS
    public List<proyecciones> listarProyecciones() {
        return proyeccionesRepository.findAll();
    }

    // BUSCAR POR ID
    public Optional<proyecciones> buscarPorId(int id) {
        return proyeccionesRepository.findById(id);
    }

    // ACTUALIZAR
    public proyecciones actualizarProyeccion(proyecciones p) {
        return proyeccionesRepository.save(p);
    }

    // ELIMINAR
    public void eliminarProyeccion(int id) {
        proyeccionesRepository.deleteById(id);
    }
}
