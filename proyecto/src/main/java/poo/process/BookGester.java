package poo.process;
import poo.data.Book;
import poo.ui.Lang;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * La clase BookGester gestiona una colección de libros, permitiendo agregar y recuperar libros según su título.
 */

public class BookGester {
    private Lang lang;

    /**
     * Agrega un nuevo libro a la lista de libros gestionados.
     *
     * @param titulo Es la variable de título del libro.
     * @param genero Es la variable de género del libro.
     * @param edad  Es la variable de edad recomendada para el libro.
     */

    public void addBook(String titulo, String genero, int edad, int id) {
        Book book = new Book(titulo, genero, edad, id);
        String fileName = "Book.txt";
        String content = "\n" + toString(book);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
            bw.write(content);
        } catch (IOException e){
            System.out.println(lang.ERRBOOK + e.getMessage());
        }
    }

    private String toString(Book book){
        return book.getTitulo() + "; " + book.getGenero() + "; " + book.getEdad() + "; " + book.getID(); 
    } 
}
