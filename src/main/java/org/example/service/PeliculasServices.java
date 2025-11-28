package org.example.service;

import org.example.ConexionBd;
import org.example.model.peliculas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PeliculasServices {

    // INSERTAR
    public static void insertarPelicula(peliculas p) {
        String sql = "INSERT INTO peliculas (titulo, duracion_minutos, genero, clasificacion, director, sinopsis, " +
                "fecha_estreno, popularidad, activa, fecha_baja) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getTitulo());
            stmt.setInt(2, p.getDuracion_minutos());
            stmt.setString(3, p.getGenero());
            stmt.setString(4, p.getClasificacion());
            stmt.setString(5, p.getDirector());
            stmt.setString(6, p.getSinopsis());
            stmt.setDate(7, Date.valueOf(p.getFecha_estreno()));
            stmt.setInt(8, p.getPopularidad());
            stmt.setBoolean(9, p.isActiva());

            if (p.getFecha_baja() != null) {
                stmt.setDate(10, Date.valueOf(p.getFecha_baja()));
            } else {
                stmt.setNull(10, Types.DATE);
            }

            stmt.executeUpdate();
            System.out.println("Película insertada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // LISTAR
    public static List<peliculas> listarPeliculas() {
        List<peliculas> lista = new ArrayList<>();
        String sql = "SELECT * FROM peliculas";

        try (Connection conn = ConexionBd.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                peliculas p = new peliculas(
                        rs.getInt("id_pelicula"),
                        rs.getString("titulo"),
                        rs.getInt("duracion_minutos"),
                        rs.getString("genero"),
                        rs.getString("clasificacion"),
                        rs.getString("director"),
                        rs.getString("sinopsis"),
                        rs.getDate("fecha_estreno").toLocalDate(),
                        rs.getInt("popularidad"),
                        rs.getBoolean("activa"),
                        rs.getDate("fecha_baja") != null ? rs.getDate("fecha_baja").toLocalDate() : null
                );

                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // BUSCAR POR ID
    public static peliculas obtenerPeliculaPorId(int id) {
        String sql = "SELECT * FROM peliculas WHERE id_pelicula=?";
        peliculas p = null;

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                p = new peliculas(
                        rs.getInt("id_pelicula"),
                        rs.getString("titulo"),
                        rs.getInt("duracion_minutos"),
                        rs.getString("genero"),
                        rs.getString("clasificacion"),
                        rs.getString("director"),
                        rs.getString("sinopsis"),
                        rs.getDate("fecha_estreno").toLocalDate(),
                        rs.getInt("popularidad"),
                        rs.getBoolean("activa"),
                        rs.getDate("fecha_baja") != null ? rs.getDate("fecha_baja").toLocalDate() : null
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return p;
    }

    // ACTUALIZAR
    public static void actualizarPelicula(peliculas p) {
        String sql = "UPDATE peliculas SET titulo=?, duracion_minutos=?, genero=?, clasificacion=?, director=?, " +
                "sinopsis=?, fecha_estreno=?, popularidad=?, activa=?, fecha_baja=? WHERE id_pelicula=?";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getTitulo());
            stmt.setInt(2, p.getDuracion_minutos());
            stmt.setString(3, p.getGenero());
            stmt.setString(4, p.getClasificacion());
            stmt.setString(5, p.getDirector());
            stmt.setString(6, p.getSinopsis());
            stmt.setDate(7, Date.valueOf(p.getFecha_estreno()));
            stmt.setInt(8, p.getPopularidad());
            stmt.setBoolean(9, p.isActiva());

            if (p.getFecha_baja() != null) {
                stmt.setDate(10, Date.valueOf(p.getFecha_baja()));
            } else {
                stmt.setNull(10, Types.DATE);
            }

            stmt.setInt(11, p.getId_pelicula());

            stmt.executeUpdate();
            System.out.println("Película actualizada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ELIMINAR FÍSICO
    public static void eliminarPelicula(int id) {
        String sql = "DELETE FROM peliculas WHERE id_pelicula=?";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Película eliminada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ELIMINAR LÓGICO
    public static void desactivarPelicula(int id) {
        String sql = "UPDATE peliculas SET activa=false, fecha_baja=CURDATE() WHERE id_pelicula=?";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Película desactivada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


