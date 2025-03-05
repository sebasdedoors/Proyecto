package poo.testClass;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import poo.data.Book;
import poo.ui.Lang;

public class BookTest {
    private Lang lang;

    @Test
    public void testBookCreation(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertEquals("El libro Troll", book.getTitulo());
        assertEquals("Comedia", book.getGenero());
        assertEquals(18, book.getEdad());
        assertEquals(1234, book.getID());
    }

    @Test
    public void testSetTituloValid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        book.setTitulo("El libro Troll 2");;
        assertEquals("El libro Troll 2", book.getTitulo());
    }

    @Test
    public void testSetTiutloInvalid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertThrows(IllegalArgumentException.class, () -> {
            book.setTitulo("");
    });
    }

    @Test
    public void testSetGeneroValid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        book.setGenero("Terror");
        assertEquals("Terror", book.getGenero());
    }

    @Test
    public void testSetGeneroInvalid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertThrows(IllegalArgumentException.class, () -> {
            book.setGenero("");
    });
    }

    @Test
    public void testSetAgeValid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        book.setEdad(18);
        assertEquals(18, book.getEdad());
    }

    public void testSetAgeInvalid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertThrows(IllegalArgumentException.class, () -> {
            book.setEdad(0);
        });
    }

    @Test
    public void testSetIdValid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        book.setID(1234);
        assertEquals(1234, book.getID());
    }

    public void testSetIdInvalid(){
        Book book = new Book("El libro Troll", "Comedia", 18, 1234);
        assertThrows(IllegalArgumentException.class, () -> {
            book.setID(0);
        });
    }
}