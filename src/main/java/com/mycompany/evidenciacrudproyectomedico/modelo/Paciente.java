package com.mycompany.evidenciacrudproyectomedico.modelo;

import java.sql.Date;

public class Paciente {

    // Atributos del paciente
    private int idPaciente;
    private String nombre;
    private String correo;
    private Date fechaNacimiento;
    private String sexo;
    private String etnia;
    private String pais;

    // Constructor vacío
    public Paciente() {
    }

    // Constructor con parámetros, útil para insertar registros
    public Paciente(String nombre, String correo, Date fechaNacimiento, String sexo, String etnia, String pais) {
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.etnia = etnia;
        this.pais = pais;
    }

    // Getters y setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Este método ayuda a mostrar el objeto en consola de forma clara
    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo='" + sexo + '\'' +
                ", etnia='" + etnia + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}