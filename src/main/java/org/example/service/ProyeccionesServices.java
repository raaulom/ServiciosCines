package org.example.service;

import org.example.ConexionBd;
import org.example.model.proyecciones;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProyeccionesServices {

    // INSERTAR
    public static void insertarProyeccion(proyecciones p) {

        String sql = "INSERT INTO proyecciones (id_pelicula, id_sala, fecha_hora_inicio, fecha_hora_fin, precio_entrada, asientos_disponibles) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, p.getId_pelicula());
            stmt.setInt(2, p.getId_sala());
            stmt.setDate(3, Date.valueOf(p.getFecha_hora_inicio()));
            stmt.setDate(4, Date.valueOf(p.getFecha_hora_fin()));
            stmt.setInt(5, p.getPrecio_entrada());
            stmt.setInt(6, p.getAsientos_disponibles());

            stmt.executeUpdate();
            System.out.println("Proyección insertada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // LISTAR
    public static List<proyecciones> listarProyecciones() {

        List<proyecciones> lista = new ArrayList<>();
        String sql = "SELECT * FROM proyecciones";

        try (Connection conn = ConexionBd.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                proyecciones p = new proyecciones(
                        rs.getInt("id_proyeccion"),
                        rs.getInt("id_pelicula"),
                        rs.getInt("id_sala"),
                        rs.getDate("fecha_hora_inicio").toLocalDate(),
                        rs.getDate("fecha_hora_fin").toLocalDate(),
                        rs.getInt("precio_entrada"),
                        rs.getInt("asientos_disponibles")
                );

                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // ACTUALIZAR
    public static void actualizarProyeccion(proyecciones p) {

        String sql = "UPDATE proyecciones SET id_pelicula = ?, id_sala = ?, fecha_hora_inicio = ?, "
                + "fecha_hora_fin = ?, precio_entrada = ?, asientos_disponibles = ? "
                + "WHERE id_proyeccion = ?";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, p.getId_pelicula());
            stmt.setInt(2, p.getId_sala());
            stmt.setDate(3, Date.valueOf(p.getFecha_hora_inicio()));
            stmt.setDate(4, Date.valueOf(p.getFecha_hora_fin()));
            stmt.setInt(5, p.getPrecio_entrada());
            stmt.setInt(6, p.getAsientos_disponibles());
            stmt.setInt(7, p.getId_proyeccion());

            stmt.executeUpdate();
            System.out.println("Proyección actualizada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ELIMINAR
    public static void eliminarProyeccion(int id_proyeccion) {

        String sql = "DELETE FROM proyecciones WHERE id_proyeccion = ?";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_proyeccion);
            stmt.executeUpdate();
            System.out.println("Proyección eliminada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
