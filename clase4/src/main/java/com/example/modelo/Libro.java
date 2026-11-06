package com.example.modelo;

public class Libro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private double precio;
    private int stock;

    public Libro() {
    }

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion, double precio, int stock) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
        setPrecio(precio);
        setStock(stock);
    }

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
        this.precio = 0.0;
        this.stock = 0;
    }

    public Libro(String isbn, String titulo, Autor autor) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        this.anioPublicacion = 0;
        this.precio = 0.0;
        this.stock = 0;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("El ISBN no puede ser nulo o vacío.");
        }
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título del libro no puede ser nulo o vacío.");
        }
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor == null) {
            throw new IllegalArgumentException("El autor del libro no puede ser nulo.");
        }
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion < 0 || anioPublicacion > 2026) {
            throw new IllegalArgumentException("El año de publicación no es válido.");
        }
        this.anioPublicacion = anioPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro [ISBN=" + isbn + ", Título=" + titulo + ", Autor=" + (autor != null ? autor.getNombre() : "N/A") 
                + ", Año=" + anioPublicacion + ", Precio=$" + precio + ", Stock=" + stock + "]";
    }
}