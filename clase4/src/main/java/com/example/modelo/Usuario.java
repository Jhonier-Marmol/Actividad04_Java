package com.example.modelo;

public class Usuario {
    private String idUsuario;
    private String nombre;
    private String correoElectronico;
    private int librosPrestados;

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombre, String correoElectronico, int librosPrestados) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
        setCorreoElectronico(correoElectronico);
        setLibrosPrestados(librosPrestados);
    }

    public Usuario(String idUsuario, String nombre, String correoElectronico) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
        setCorreoElectronico(correoElectronico);
        this.librosPrestados = 0;
    }

    public Usuario(String idUsuario, String nombre) {
        setIdUsuario(idUsuario);
        setNombre(nombre);
        this.correoElectronico = "sin_correo@biblioteca.com";
        this.librosPrestados = 0;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        if (idUsuario == null || idUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID de usuario no puede ser nulo o vacío.");
        }
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del usuario no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico == null || !correoElectronico.contains("@")) {
            throw new IllegalArgumentException("El correo electrónico no es válido.");
        }
        this.correoElectronico = correoElectronico;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        if (librosPrestados < 0) {
            throw new IllegalArgumentException("La cantidad de libros prestados no puede ser negativa.");
        }
        this.librosPrestados = librosPrestados;
    }

    @Override
    public String toString() {
        return "Usuario [ID=" + idUsuario + ", Nombre=" + nombre + ", Correo=" + correoElectronico + ", Libros Prestados=" + librosPrestados + "]";
    }
}