package org.example.controller;

import org.example.model.Empleado;
import org.example.service.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoService service;

    public EmpleadoController(EmpleadoService service) {
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
