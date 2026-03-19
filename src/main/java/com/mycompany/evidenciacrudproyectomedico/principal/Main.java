package com.mycompany.evidenciacrudproyectomedico.principal;

import com.mycompany.evidenciacrudproyectomedico.dao.PacienteDAO;
import com.mycompany.evidenciacrudproyectomedico.modelo.Paciente;

import java.sql.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creamos el objeto DAO para trabajar con la tabla paciente
        PacienteDAO dao = new PacienteDAO();

        // =========================
        // 1. INSERTAR DOS PACIENTES
        // =========================
        Paciente paciente1 = new Paciente(
                "Ana Torres",
                "ana@gmail.com",
                Date.valueOf("1998-05-10"),
                "Femenino",
                "Mestiza",
                "Colombia"
        );

        Paciente paciente2 = new Paciente(
                "Luis Perez",
                "luis@gmail.com",
                Date.valueOf("1992-11-22"),
                "Masculino",
                "Afrodescendiente",
                "Colombia"
        );

        int id1 = dao.insertar(paciente1);
        int id2 = dao.insertar(paciente2);

        // =========================
        // 2. LISTAR TODOS
        // =========================
        System.out.println("\n===== LISTA INICIAL DE PACIENTES =====");
        mostrarPacientes(dao.listar());

        // =========================
        // 3. BUSCAR UN PACIENTE POR ID
        // =========================
        System.out.println("\n===== BUSCAR PACIENTE POR ID =====");
        Paciente encontrado = dao.buscarPorId(id1);

        if (encontrado != null) {
            System.out.println("Paciente encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontró el paciente.");
        }

        // =========================
        // 4. ACTUALIZAR UN PACIENTE
        // =========================
        if (encontrado != null) {
            System.out.println("\n===== ACTUALIZANDO PACIENTE =====");

            encontrado.setCorreo("ana.actualizada@gmail.com");
            encontrado.setPais("Mexico");
            encontrado.setEtnia("Latina");

            dao.actualizar(encontrado);
        }

        System.out.println("\n===== LISTA DESPUES DE ACTUALIZAR =====");
        mostrarPacientes(dao.listar());

        // =========================
        // 5. ELIMINAR UN PACIENTE
        // =========================
        System.out.println("\n===== ELIMINANDO PACIENTE =====");
        dao.eliminar(id2);

        System.out.println("\n===== LISTA FINAL =====");
        mostrarPacientes(dao.listar());
    }

    // Método auxiliar para mostrar la lista completa en consola
    public static void mostrarPacientes(List<Paciente> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (Paciente p : lista) {
                System.out.println("ID: " + p.getIdPaciente()
                        + " | Nombre: " + p.getNombre()
                        + " | Correo: " + p.getCorreo()
                        + " | Fecha Nacimiento: " + p.getFechaNacimiento()
                        + " | Sexo: " + p.getSexo()
                        + " | Etnia: " + p.getEtnia()
                        + " | Pais: " + p.getPais());
            }
        }
    }
}