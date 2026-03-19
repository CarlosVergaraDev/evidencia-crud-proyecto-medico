# evidencia-crud-proyecto-medico

## Español

### Descripción
Este proyecto fue desarrollado en Java con Maven y tiene como propósito implementar un módulo CRUD para la gestión de pacientes usando JDBC y MySQL.

### Objetivo
Construir un módulo funcional de persistencia de datos que permita registrar, consultar, actualizar y eliminar información de pacientes en una base de datos relacional.

### Funcionalidades
- Insertar pacientes
- Consultar pacientes
- Actualizar pacientes
- Eliminar pacientes

### Tecnologías utilizadas
- Java
- Maven
- JDBC
- MySQL
- Apache NetBeans

### Estructura del proyecto

```
    evidenciaCrudProyectoMedico/
    ├── .gitignore
    ├── pom.xml
    ├── README.md
    └── src/
        ├── main/
        │   └── java/
        │       └── com/
        │           └── mycompany/
        │               └── evidenciacrudproyectomedico/
        │                   ├── conexion/
        │                   │   └── ConexionBD.java
        │                   ├── dao/
        │                   │   └── PacienteDAO.java
        │                   ├── modelo/
        │                   │   └── Paciente.java
        │                   └── principal/
        │                       └── Main.java
        └── test/
            └── java/
```

### Arquitectura
El proyecto está organizado por capas para facilitar la comprensión, el mantenimiento y la separación de responsabilidades:

- `conexion`: maneja la conexión con la base de datos
- `modelo`: representa la entidad Paciente
- `dao`: contiene las operaciones CRUD sobre la base de datos
- `principal`: ejecuta y prueba el funcionamiento del sistema

### Propósito académico
Este proyecto fue elaborado como evidencia académica para demostrar la codificación de módulos de software con persistencia en base de datos, aplicando una estructura organizada y buenas prácticas básicas de desarrollo.

---

## English

### Description
This project was developed in Java using Maven and aims to implement a CRUD module for patient management with JDBC and MySQL.

### Objective
To build a functional data persistence module that allows creating, retrieving, updating, and deleting patient information in a relational database.

### Features
- Insert patients
- Retrieve patients
- Update patients
- Delete patients

### Technologies Used
- Java
- Maven
- JDBC
- MySQL
- Apache NetBeans

### Project Structure

```
    evidenciaCrudProyectoMedico/
    ├── .gitignore
    ├── pom.xml
    ├── README.md
    └── src/
        ├── main/
        │   └── java/
        │       └── com/
        │           └── mycompany/
        │               └── evidenciacrudproyectomedico/
        │                   ├── conexion/
        │                   │   └── ConexionBD.java
        │                   ├── dao/
        │                   │   └── PacienteDAO.java
        │                   ├── modelo/
        │                   │   └── Paciente.java
        │                   └── principal/
        │                       └── Main.java
        └── test/
            └── java/
```

### Architecture
The project is organized in layers to improve readability, maintenance, and separation of concerns:

- `conexion`: handles the database connection
- `modelo`: represents the Patient entity
- `dao`: contains CRUD operations for database access
- `principal`: runs and tests the system behavior

### Academic Purpose
This project was created as academic evidence to demonstrate software module development with database persistence, applying a layered structure and basic coding best practices.