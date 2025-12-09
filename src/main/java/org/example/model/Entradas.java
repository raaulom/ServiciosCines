package org.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "entradas")
public class Entradas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_entrada;
    private int id_proyeccion;
    private String asiento;
    private double precio;
    private LocalDateTime fecha_compra;
    private boolean activa;


    public Entradas() {
    }

    public Entradas(int id_entrada, int id_proyeccion, String asiento,
                   double precio, LocalDateTime fecha_compra, boolean activa) {

        this.id_entrada = id_entrada;
        this.id_proyeccion = id_proyeccion;
        this.asiento = asiento;
        this.precio = precio;
        this.fecha_compra = fecha_compra;
        this.activa = activa;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public int getId_proyeccion() {
        return id_proyeccion;
    }

    public void setId_proyeccion(int id_proyeccion) {
        this.id_proyeccion = id_proyeccion;
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

    public LocalDateTime getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(LocalDateTime fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id_entrada=" + id_entrada +
                ", id_proyeccion=" + id_proyeccion +
                ", asiento='" + asiento + '\'' +
                ", precio=" + precio +
                ", fecha_compra=" + fecha_compra +
                ", activa=" + activa +
                '}';
    }
}

