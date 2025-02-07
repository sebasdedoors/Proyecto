package poo.process;

import poo.data.Book;

import java.util.ArrayList;

import java.util.List;

/**
 * La clase BookGester gestiona una colección de libros, permitiendo agregar y recuperar libros según su título.
 */

public class BookGester {
    /**
     * Lista que almacena los libros gestionados por la clase, inicializada como una lista vacía.
     */

    private List<Book> gester;

    /**
     * Constructor de la clase BookGester.  
     * Inicializa la lista de libros.
     */

    public BookGester() {
        this.gester = new ArrayList<>();
    }

    /**
     * Agrega un nuevo libro a la lista de libros gestionados.
     *
     * @param titulo Es la variable de título del libro.
     * @param genero Es la variable de género del libro.
     * @param edad  Es la variable de edad recomendada para el libro.
     */

    public void addBook(String titulo, String genero, int edad) {
        Book book = new Book(titulo, genero, edad);
        gester.add(book);
    }

    /**
     * Obtiene la lista de libros almacenados en la colección.
     * @return Una lista de objetos {@link Book}.
     */

    public List<Book> getBook() {
        return gester;
    }

    /**
     * Busca un libro en la colección por su título.
     *
     * @param titulo Título del libro a buscar.
     * @return El libro encontrado o {@code null} si no se encuentra, de tipo {@link Book}.
     */

    public Book showBook(String titulo) {
        for (Book book : gester) {
            if (book.getTitulo().equalsIgnoreCase(titulo)) {
                return book;
            }
        }
        return null;
    }
}
