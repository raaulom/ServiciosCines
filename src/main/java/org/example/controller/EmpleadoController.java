package org.example.controller;

import org.example.model.Empleado;
import org.example.service.EmpleadoServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //indica que esta clase manejará peticiones REST
@RequestMapping("/empleados") //// Prefijo para todos los endpoints relacionados con Aula
public class EmpleadoController {

    private final EmpleadoServices service;

    public EmpleadoController(EmpleadoServices service) {
        this.service = service;
    }

    @PostMapping
    public Empleado insertar(@RequestBody Empleado emp) {
        return service.insertarEmpleado(emp);
    }

    @GetMapping
    public List<Empleado> listar() {
        return service.listarEmpleados();
    }

    @PutMapping
    public Empleado actualizar(@RequestBody Empleado emp) {
        return service.actualizarEmpleado(emp);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminarEmpleado(id);
    }
}
