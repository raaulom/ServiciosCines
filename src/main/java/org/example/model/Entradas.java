package org.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "entradas")
public class Entradas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEntrada;

    @ManyToOne
    @JoinColumn(name = "id_proyeccion", nullable = false)
    private proyecciones proyeccion;

    private String asiento;
    private double precio;
    private LocalDateTime fechaCompra;
    private boolean activa;
    private String metodoPago;

    public Entradas() {}

    public Entradas(proyecciones proyeccion, String asiento, double precio,
                    LocalDateTime fechaCompra, boolean activa, String metodoPago) {
        this.proyeccion = proyeccion;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.activa = activa;
        this.metodoPago = metodoPago;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public proyecciones getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(proyecciones proyeccion) {
        this.proyeccion = proyeccion;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}

