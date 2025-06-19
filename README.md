# Literalura 📚

Proyecto realizado como parte del desafío **LiterAlura LATAM Challenge**, utilizando **Java**, **Spring Boot** y conexión a la API de [Gutendex](https://gutendex.com/).

## 🚀 Descripción

Esta aplicación permite:

- Consultar libros desde la API pública de Gutendex.
- Registrar y almacenar libros y autores en una base de datos local.
- Buscar libros por idioma, autor, entre otros.
- Mostrar estadísticas de autores y libros.

## 🛠️ Tecnologías utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (por defecto)
- Lombok
- Maven

## 📦 Estructura del proyecto
literalura/
├── src/
│ ├── main/
│ │ ├── java/com/alura/literalura/
│ │ │ ├── config/ # Configuración de logging
│ │ │ ├── dto/ # Clases DTO
│ │ │ ├── model/ # Entidades JPA
│ │ │ ├── repository/ # Interfaces de repositorio JPA
│ │ │ ├── service/ # Lógica de negocio
│ │ │ ├── principal/ # Clase con menú interactivo
│ │ │ └── LiteraluraApplication.java
│ ├── resources/
│ │ └── application.properties
├── pom.xml
