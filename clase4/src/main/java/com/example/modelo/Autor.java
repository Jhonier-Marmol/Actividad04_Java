package com.example.modelo;

public class Autor {
    private String idAutor;
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    public Autor() {
    }

    public Autor(String idAutor, String nombre, String nacionalidad, int anioNacimiento) {
        setIdAutor(idAutor);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
        setAnioNacimiento(anioNacimiento);
    }

    public Autor(String idAutor, String nombre) {
        setIdAutor(idAutor);
        setNombre(nombre);
        this.nacionalidad = "Desconocida";
        this.anioNacimiento = 0;
    }

    public Autor(String idAutor, String nombre, String nacionalidad) {
        setIdAutor(idAutor);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
        this.anioNacimiento = 0;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        if (idAutor == null || idAutor.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID del autor no puede ser nulo o vacío.");
        }
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del autor no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad == null || nacionalidad.trim().isEmpty()) {
            this.nacionalidad = "Desconocida";
        } else {
            this.nacionalidad = nacionalidad;
        }
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento < 0 || anioNacimiento > 2026) {
            throw new IllegalArgumentException("El año de nacimiento no es válido.");
        }
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return "Autor [ID=" + idAutor + ", Nombre=" + nombre + ", Nacionalidad=" + nacionalidad + ", Año Nacimiento=" + anioNacimiento + "]";
    }
}