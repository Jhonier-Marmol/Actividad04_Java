package com.example;

import com.example.modelo.Autor;
import com.example.modelo.Libro;
import com.example.modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE BIBLIOTECA DIGITAL ===");
        
        try {
            Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana", 1927);
            Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
            
            System.out.println("\n--- AUTORES REGISTRADOS ---");
            System.out.println(autor1);
            System.out.println(autor2);

            Libro libro1 = new Libro("978-0307474728", "Cien años de soledad", autor1, 1967, 45500.0, 5);
            Libro libro2 = new Libro("978-9562580802", "La casa de los espíritus", autor2, 1982); // Sobrecargado sin precio/stock

            System.out.println("\n--- LIBROS REGISTRADOS ---");
            System.out.println(libro1);
            System.out.println(libro2);

            Usuario usuario1 = new Usuario("U001", "Carlos Pérez", "carlos.perez@email.com", 2);
            Usuario usuario2 = new Usuario("U002", "Ana Gómez", "ana.gomez@email.com"); // Sin libros prestados

            System.out.println("\n--- USUARIOS REGISTRADOS ---");
            System.out.println(usuario1);
            System.out.println(usuario2);

            System.out.println("\n--- PROBANDO VALIDACIONES DE ERRORES ---");

            libro1.setPrecio(-100.0);

        } catch (IllegalArgumentException e) {
            System.err.println("Error de validación capturado: " + e.getMessage());
        }
    }
}