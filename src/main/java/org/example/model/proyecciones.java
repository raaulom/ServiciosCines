package org.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "proyecciones")
public class proyecciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProyeccion;

    private int idPelicula;
    private int idSala;

    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    private int precioEntrada;
    private int asientosDisponibles;

    public proyecciones() {
    }

    public proyecciones(int idProyeccion, int idPelicula, int idSala,
                        LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin,
                        int precioEntrada, int asientosDisponibles) {

        this.idProyeccion = idProyeccion;
        this.idPelicula = idPelicula;
        this.idSala = idSala;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.precioEntrada = precioEntrada;
        this.asientosDisponibles = asientosDisponibles;
    }

    public int getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(int idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    @Override
    public String toString() {
        return "Proyeccion{" +
                "idProyeccion=" + idProyeccion +
                ", idPelicula=" + idPelicula +
                ", idSala=" + idSala +
                ", fechaHoraInicio=" + fechaHoraInicio +
                ", fechaHoraFin=" + fechaHoraFin +
                ", precioEntrada=" + precioEntrada +
                ", asientosDisponibles=" + asientosDisponibles +
                '}';
    }
}
