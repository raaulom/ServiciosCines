package org.example.service;

import org.example.model.Empleado;
import org.example.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    private final EmpleadoRepository repo;

    public EmpleadoService(EmpleadoRepository repo) {
        this.repo = repo;
    }

    // INSERTAR
    public Empleado insertarEmpleado(Empleado emp) {
        return repo.save(emp);
    }

    // LISTAR
    public List<Empleado> listarEmpleados() {
        return repo.findAll();
    }

    // ACTUALIZAR
    public Empleado actualizarEmpleado(Empleado emp) {
        return repo.save(emp);
    }

    // ELIMINAR
    public void eliminarEmpleado(int id) {
        repo.deleteById(id);
    }
}


