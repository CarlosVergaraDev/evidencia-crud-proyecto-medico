package com.mycompany.evidenciacrudproyectomedico.dao;

import com.mycompany.evidenciacrudproyectomedico.conexion.ConexionBD;
import com.mycompany.evidenciacrudproyectomedico.modelo.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    // Método para insertar un paciente
    public int insertar(Paciente paciente) {
        String sql = "INSERT INTO paciente (nombre, correo, fecha_nacimiento, sexo, etnia, pais) VALUES (?, ?, ?, ?, ?, ?)";
        int idGenerado = -1;

        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getCorreo());
            ps.setDate(3, paciente.getFechaNacimiento());
            ps.setString(4, paciente.getSexo());
            ps.setString(5, paciente.getEtnia());
            ps.setString(6, paciente.getPais());

            int filas = ps.executeUpdate();

            if (filas > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    idGenerado = rs.getInt(1);
                }
                System.out.println("Paciente insertado correctamente.");
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }

        return idGenerado;
    }

    // Método para consultar todos los pacientes
    public List<Paciente> listar() {
        List<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM paciente";

        try (Connection con = ConexionBD.obtenerConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("id_paciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setCorreo(rs.getString("correo"));
                paciente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                paciente.setSexo(rs.getString("sexo"));
                paciente.setEtnia(rs.getString("etnia"));
                paciente.setPais(rs.getString("pais"));

                lista.add(paciente);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }

        return lista;
    }

    // Método para buscar un paciente por su ID
    public Paciente buscarPorId(int id) {
        String sql = "SELECT * FROM paciente WHERE id_paciente = ?";

        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("id_paciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setCorreo(rs.getString("correo"));
                paciente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                paciente.setSexo(rs.getString("sexo"));
                paciente.setEtnia(rs.getString("etnia"));
                paciente.setPais(rs.getString("pais"));

                return paciente;
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar: " + e.getMessage());
        }

        return null;
    }

    // Método para actualizar un paciente existente
    public boolean actualizar(Paciente paciente) {
        String sql = "UPDATE paciente SET nombre = ?, correo = ?, fecha_nacimiento = ?, sexo = ?, etnia = ?, pais = ? WHERE id_paciente = ?";

        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getCorreo());
            ps.setDate(3, paciente.getFechaNacimiento());
            ps.setString(4, paciente.getSexo());
            ps.setString(5, paciente.getEtnia());
            ps.setString(6, paciente.getPais());
            ps.setInt(7, paciente.getIdPaciente());

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Paciente actualizado correctamente.");
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }

        return false;
    }

    // Método para eliminar un paciente por ID
    public boolean eliminar(int id) {
        String sql = "DELETE FROM paciente WHERE id_paciente = ?";

        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Paciente eliminado correctamente.");
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }

        return false;
    }
}