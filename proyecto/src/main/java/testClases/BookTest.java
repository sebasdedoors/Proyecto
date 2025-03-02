package testClases;


import org.junit.Test;
import poo.data.Book;

public class BookTest {
    //*Test de la clase Book */
    @Test
    public void testCreacionValida() {
        //* */ Prueba con valores válidos*/
        Book libro = new Book("El libor troll", "Aventura", 10);
        System.out.println("El libro troll: " + libro.getTitulo());
        System.out.println("Aventura: " + libro.getGenero());
        System.out.println("Edad: " + libro.getEdad());
    }
        //* Título con números debe lanzar excepción*/
    @Test
    (expected = IllegalArgumentException.class)
    public void testTituloInvalido() {
        
        new Book("Libro123", "Aventura", 12);
    }
         //* Título vacío debe lanzar excepción*/
    @Test
    (expected = IllegalArgumentException.class)
    public void testTituloVacio() {
       
        new Book("", "Aventura", 12);
    }
        //* Género vacío debe lanzar excepción*/
    @Test
    (expected = IllegalArgumentException.class)
    public void testGeneroVacio() {
        
        new Book("Luna de pluton", "", 12);
    }
    //* Edad menor o igual a 0 debe lanzar excepción*/
    @Test(
        expected = IllegalArgumentException.class)
    public void testEdadInvalida() {
        
        new Book("Luna de pluton", "Aventura", -5);
    }
}
