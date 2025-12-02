package org.example.controller;

import org.example.model.proyecciones;
import org.example.service.ProyeccionesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proyecciones")
@CrossOrigin(origins = "*")
public class ProyeccionesController {

    @Autowired
    private ProyeccionesServices proyeccionesServices;

    // INSERTAR
    @PostMapping("/insertar")
    public proyecciones insertarProyeccion(@RequestBody proyecciones p) {
        return proyeccionesServices.insertarProyeccion(p);
    }

    // LISTAR TODOS
    @GetMapping("/listar")
    public List<proyecciones> listarProyecciones() {
        return proyeccionesServices.listarProyecciones();
    }

    // BUSCAR POR ID
    @GetMapping("/buscar/{id}")
    public Optional<proyecciones> buscarPorId(@PathVariable int id) {
        return proyeccionesServices.buscarPorId(id);
    }

    // ACTUALIZAR
    @PutMapping("/actualizar")
    public proyecciones actualizarProyeccion(@RequestBody proyecciones p) {
        return proyeccionesServices.actualizarProyeccion(p);
    }

    // ELIMINAR
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProyeccion(@PathVariable int id) {
        proyeccionesServices.eliminarProyeccion(id);
    }
}

