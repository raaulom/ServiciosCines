package org.example.model;

import java.time.LocalDate;

public class peliculas {
        private int id_pelicula;
        private String titulo;
        private int duracion_minutos;
        private String genero;
        private String clasificacion;
        private String director;
        private String sinopsis;
        private LocalDate fecha_estreno;
        private int popularidad;
        private boolean activa;
        private LocalDate fecha_baja;

    public peliculas(int id_pelicula, String titulo, int duracion_minutos, String genero,
                     String clasificacion, String director, String sinopsis,
                     LocalDate fecha_estreno, int popularidad, boolean activa, LocalDate fecha_baja) {
        this.id_pelicula = id_pelicula;
        this.titulo = titulo;
        this.duracion_minutos = duracion_minutos;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.director = director;
        this.sinopsis = sinopsis;
        this.fecha_estreno = fecha_estreno;
        this.popularidad = popularidad;
        this.activa = activa;
        this.fecha_baja = fecha_baja;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion_minutos() {
        return duracion_minutos;
    }

    public void setDuracion_minutos(int duracion_minutos) {
        this.duracion_minutos = duracion_minutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public LocalDate getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(LocalDate fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public LocalDate getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(LocalDate fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    @Override
    public String toString() {
        return "peliculas{" +
                "id_pelicula=" + id_pelicula +
                ", titulo='" + titulo + '\'' +
                ", duracion_minutos=" + duracion_minutos +
                ", genero='" + genero + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", director='" + director + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", fecha_estreno=" + fecha_estreno +
                ", popularidad=" + popularidad +
                ", activa=" + activa +
                ", fecha_baja=" + fecha_baja +
                '}';
    }
}
