package org.example.model;

import java.time.LocalDate;

public class proyecciones {
    private int id_proyeccion;
    private int id_pelicula;
    private int id_sala;
    private LocalDate fecha_hora_inicio;
    private LocalDate fecha_hora_fin;
    private int precio_entrada;
    private int asientos_disponibles;

    public proyecciones(int id_proyeccion, int id_pelicula, int id_sala,
                        LocalDate fecha_hora_inicio, LocalDate fecha_hora_fin,
                        int precio_entrada, int asientos_disponibles) {

        this.id_proyeccion = id_proyeccion;
        this.id_pelicula = id_pelicula;
        this.id_sala = id_sala;
        this.fecha_hora_inicio = fecha_hora_inicio;
        this.fecha_hora_fin = fecha_hora_fin;
        this.precio_entrada = precio_entrada;
        this.asientos_disponibles = asientos_disponibles;
    }

    public int getId_proyeccion() {
        return id_proyeccion;
    }

    public void setId_proyeccion(int id_proyeccion) {
        this.id_proyeccion = id_proyeccion;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public LocalDate getFecha_hora_inicio() {
        return fecha_hora_inicio;
    }

    public void setFecha_hora_inicio(LocalDate fecha_hora_inicio) {
        this.fecha_hora_inicio = fecha_hora_inicio;
    }

    public LocalDate getFecha_hora_fin() {
        return fecha_hora_fin;
    }

    public void setFecha_hora_fin(LocalDate fecha_hora_fin) {
        this.fecha_hora_fin = fecha_hora_fin;
    }

    public int getPrecio_entrada() {
        return precio_entrada;
    }

    public void setPrecio_entrada(int precio_entrada) {
        this.precio_entrada = precio_entrada;
    }

    public int getAsientos_disponibles() {
        return asientos_disponibles;
    }

    public void setAsientos_disponibles(int asientos_disponibles) {
        this.asientos_disponibles = asientos_disponibles;
    }

    @Override
    public String toString() {
        return "proyecciones{" +
                "id_proyeccion=" + id_proyeccion +
                ", id_pelicula=" + id_pelicula +
                ", id_sala=" + id_sala +
                ", fecha_hora_inicio=" + fecha_hora_inicio +
                ", fecha_hora_fin=" + fecha_hora_fin +
                ", precio_entrada=" + precio_entrada +
                ", asientos_disponibles=" + asientos_disponibles +
                '}';
    }
}
