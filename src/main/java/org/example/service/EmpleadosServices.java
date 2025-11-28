package org.example.service;

import org.example.repository.ConexionBd;
import org.example.model.Empleado;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosServices {

    // INSERTAR
    public static void insertarEmpleado(Empleado emp) {

        String sql = "INSERT INTO empleados (nombre, puesto, tipo_jornada, email, telefono, fecha_contratacion, salario_hora, activo) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, emp.getNombre());
            stmt.setString(2, emp.getPuesto());
            stmt.setString(3, emp.getTipoJornada());
            stmt.setString(4, emp.getEmail());
            stmt.setInt(5, emp.getTelefono());
            stmt.setString(6, emp.getFechaContratacion());
            stmt.setDouble(7, emp.getSalarioHora());
            stmt.setBoolean(8, emp.isActivo());

            stmt.executeUpdate();
            System.out.println("Empleado insertado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // LISTAR
    public static List<Empleado> listarEmpleados() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM empleados";
        //lista = empleados.findAll()
        try (Connection conn = ConexionBd.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Empleado emp = new Empleado(
                        rs.getInt("id_empleado"),
                        rs.getString("nombre"),
                        rs.getString("puesto"),
                        rs.getString("tipo_jornada"),
                        rs.getString("email"),
                        rs.getInt("telefono"),
                        rs.getString("fecha_contratacion"),
                        rs.getDouble("salario_hora"),
                        rs.getBoolean("activo")
                );
                lista.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
    // ACTUALIZAR
    public static void actualizarEmpleado(Empleado emp) {
        String sql = "UPDATE empleados SET nombre=?, puesto=?, tipo_jornada=?, email=?, telefono=?, " +
                "fecha_contratacion=?, salario_hora=?, activo=? WHERE id_empleado=?";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, emp.getNombre());
            stmt.setString(2, emp.getPuesto());
            stmt.setString(3, emp.getTipoJornada());
            stmt.setString(4, emp.getEmail());
            stmt.setInt(5, emp.getTelefono());
            stmt.setString(6, emp.getFechaContratacion());
            stmt.setDouble(7, emp.getSalarioHora());
            stmt.setBoolean(8, emp.isActivo());
            stmt.setInt(9, emp.getIdEmpleado());

            stmt.executeUpdate();
            System.out.println("Empleado actualizado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // ELIMINAR
    public static void eliminarEmpleado(int id) {
        String sql = "DELETE FROM empleados WHERE id_empleado=?";

        try (Connection conn = ConexionBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Empleado eliminado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

