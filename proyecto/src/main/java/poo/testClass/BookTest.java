package poo.testClass;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import poo.data.Book;
import poo.ui.Lang;

public class BookTest {
    private Lang lang;

    /*Este metodo se asegura de la correcta creación de un libro. */
    @Test
    public void testBookCreation(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertEquals("El libro Troll", book.getTitulo());
        assertEquals("Comedia", book.getGenero());
        assertEquals(18, book.getEdad());
        assertEquals(1234, book.getID());
    }

    /*Este metodo se asegura de la correcta asignación del titulo al libro. */
    @Test
    public void testSetTituloValid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        book.setTitulo("El libro Troll 2");;
        assertEquals("El libro Troll 2", book.getTitulo());
    }

    /*Este metodo se asegura de que el mensaje del error le llegue al usuario. */
    @Test
    public void testSetTiutloInvalid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertThrows(IllegalArgumentException.class, () -> {
            book.setTitulo("");
    });
    }

    /*Este metodo se asegura de la correcta asignación del género al libro creado. */
    @Test
    public void testSetGeneroValid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        book.setGenero("Terror");
        assertEquals("Terror", book.getGenero());
    }

    /*Este metodo se asegura de que el usuario reciba el mensaje de error correspondiente. */
    @Test
    public void testSetGeneroInvalid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertThrows(IllegalArgumentException.class, () -> {
            book.setGenero("");
    });
    }

    /*Este metodo se asegura de la correcta asignación de la edad recomendada para el libro. */
    @Test
    public void testSetAgeValid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        book.setEdad(18);
        assertEquals(18, book.getEdad());
    }

    /*Este metodo se asegura del correcto recibimiento del mensaje de error por el usuario. */
    public void testSetAgeInvalid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertThrows(IllegalArgumentException.class, () -> {
            book.setEdad(0);
        });
    }

    /*Este metodo se asegura de la correcta asignación del ID del libro. */
    @Test
    public void testSetIdValid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        book.setID(1234);
        assertEquals(1234, book.getID());
    }

    /*Este metodo se asegura del correcto recibimiento del mensaje de error por el usuario. */
    public void testSetIdInvalid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertThrows(IllegalArgumentException.class, () -> {
            book.setID(0);
        });
    }
}