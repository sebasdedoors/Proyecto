package poo.testClass;
import static org.junit.Assert.fail;

import org.junit.Test;
import poo.data.Book;

public class BookTest {
    //*Test de la clase Book */
    @Test
    public void testCreacionValida() {
        //* Prueba con valores válidos*/
        Book libro = new Book("El libro", "Aventura", 10, 1234);
        System.out.println("El libro troll: " + libro.getTitulo());
        System.out.println("Aventura: " + libro.getGenero());
        System.out.println("Edad: " + libro.getEdad());
    }
        //* Título con números debe lanzar excepción*/
    @Test
    public void testTituloConNumeros() {
        try {
            new Book("Libro123", "Aventura", 12, 4321);
            fail("Se esperaba una IllegalArgumentException por un título con números");
        } catch (IllegalArgumentException e) {
            System.out.println("El titulo no puede contener números ni estar vacio. " + e.getMessage());
        }
    }
         //* Título vacío debe lanzar excepción*/
    @Test
    public void testTituloVacio() {
        try {
            new Book("", "Aventura", 12,1122);
            fail("Se esperaba una IllegalArgumentException por un título vacío");
        } catch (IllegalArgumentException e) {
            System.out.println("El titulo no puede contener números ni estar vacio. " + e.getMessage());
        }
    }
        //* Género vacío debe lanzar excepción*/
    @Test
    public void testGeneroVacio() {
        try {
            new Book("Luna de pluton", "", 12,2211);
            fail("Se esperaba una IllegalArgumentException por un género vacío");
        } catch (IllegalArgumentException e) {
            System.out.println("El campo no puede estar en blanco. " + e.getMessage());
        }
    }
    //* Edad menor o igual a 0 debe lanzar excepción*/
    @Test
    public void testEdadInvalida() {
        try {
            new Book("El librin", "Aventura", -5,1111);
            fail("Se esperaba una IllegalArgumentException por una edad negativa");
        } catch (IllegalArgumentException e) {
            System.out.println("La edad debe ser mayor a 0. " + e.getMessage());
        }
    }
}