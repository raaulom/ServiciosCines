package org.example.service;

import org.example.model.Entradas;
import org.example.model.proyecciones;
import org.example.repository.EntradasRepository;
import org.example.repository.ProyeccionesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EntradasServices {

    private final EntradasRepository entradasRepository;
    private final ProyeccionesRepository proyeccionesRepository;

    public EntradasServices(EntradasRepository entradasRepository, ProyeccionesRepository proyeccionesRepository) {
        this.entradasRepository = entradasRepository;
        this.proyeccionesRepository = proyeccionesRepository;
    }

    public Entradas comprarEntrada(int idProyeccion, String asiento, double precio, String metodoPago) {
        proyecciones proy = proyeccionesRepository.findById(idProyeccion)
                .orElseThrow(() -> new RuntimeException("Proyección no encontrada"));

        if (proy.getAsientosDisponibles() <= 0) {
            throw new RuntimeException("No quedan asientos disponibles");
        }

        proy.setAsientosDisponibles(proy.getAsientosDisponibles() - 1);
        proyeccionesRepository.save(proy);

        Entradas entrada = new Entradas(proy, asiento, precio, LocalDateTime.now(), true, metodoPago);

        return entradasRepository.save(entrada);
    }

    public Entradas devolverEntrada(int idEntrada) {
        Entradas entrada = entradasRepository.findById(idEntrada)
                .orElseThrow(() -> new RuntimeException("Entrada no encontrada"));

        if (!entrada.isActiva()) {
            throw new RuntimeException("La entrada ya ha sido devuelta");
        }

        entrada.setActiva(false);

        proyecciones proy = entrada.getProyeccion();
        proy.setAsientosDisponibles(proy.getAsientosDisponibles() + 1);
        proyeccionesRepository.save(proy);

        return entradasRepository.save(entrada);
    }

    public List<Entradas> listar() {
        return entradasRepository.findAll();
    }

    public Entradas obtenerPorId(int id) {
        return entradasRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entrada no encontrada"));
    }
}
