package com.mycompany.evidenciacrudproyectomedico.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // Datos de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_medico";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    // Método para abrir la conexión con MySQL
    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
