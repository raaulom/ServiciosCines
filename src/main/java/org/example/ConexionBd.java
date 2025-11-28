package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBd {

    private static final String URL = "jdbc:postgresql://localhost:5432/CineRaulOca";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public static Connection getConnection() {
        Connection cone = null;

        try {
            Class.forName("org.postgresql.Driver");
            cone = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }

        return cone;
    }
}

