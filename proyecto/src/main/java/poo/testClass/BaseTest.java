package poo.testClass;

import static org.junit.Assert.*;
import org.junit.Test;
import poo.process.BaseManager;

import java.io.*;

public class BaseTest {
    private final String BOOK_FILE = "Book.txt";
    private final String USER_FILE = "User.txt";
    private final String BORROW_FILE = "Borrows.txt";

    @Test
    public void testValid() {
        try {
            // Escribir datos en los archivos para la prueba
            escribirArchivo(BOOK_FILE, "El Quijote");
            escribirArchivo(USER_FILE, "Juan Perez");

            BaseManager manager = new BaseManager();
            manager.makeBorrow("Juan Perez", "El Quijote", 7);

            // Verificar que se escribió en el archivo de préstamos
            assertTrue(buscarEnArchivo(BORROW_FILE, "Juan Perez; El Quijote"));
        } catch (Exception e) {
            fail(lang.ERRORLEND + e.getMessage());
        }
    }

    @Test
    public void testLibroNoExistente() {
        try {
            // Asegurar que el archivo está vacío
            limpiarArchivo(BOOK_FILE);

            BaseManager manager = new BaseManager();
            manager.makeBorrow("Juan Perez", "Libro Fantasma", 7);

            // No debe existir el préstamo
            assertFalse(buscarEnArchivo(BORROW_FILE, "Juan Perez; Libro Fantasma"));
        } catch (Exception e) {
            fail(lang.ERRORBOOKEXIST + e.getMessage());
        }
    }

    @Test
    public void testUsuarioNoExistente() {
        try {
            // Asegurar que el archivo está vacío
            limpiarArchivo(USER_FILE);

            BaseManager manager = new BaseManager();
            manager.makeBorrow("Usuario Fantasma", "El Quijote", 7);

            // No debe existir el préstamo
            assertFalse(buscarEnArchivo(BORROW_FILE, "Usuario Fantasma; El Quijote"));
        } catch (Exception e) {
            fail(lang.ERRORUSEREXIST + e.getMessage());
        }
    }

    // Métodos auxiliares para manejar archivos en las pruebas
    private void escribirArchivo(String archivo, String contenido) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(contenido);
            bw.newLine();
        }
    }

    private boolean buscarEnArchivo(String archivo, String texto) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(texto)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void limpiarArchivo(String archivo) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(""); // Borra el contenido del archivo
        }
    }
}
