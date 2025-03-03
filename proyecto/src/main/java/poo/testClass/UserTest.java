package poo.testClass;
import poo.data.User;
import org.junit.Test;

public class UserTest {
    @Test
    public void testValido() {
        try {
            User user = new User("Victor", 15);
            System.out.println("Nombre: " + user.getName());
            System.out.println("Estado: " + user.getStatus());
            System.out.println("Edad: " + user.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el usuario: " + e.getMessage());
        }
    }
    
    @Test
    public void testInvalido() {
        try {
            User user = new User("", -5); // Valores inválidos para probar las excepciones
            System.out.println("Nombre: " + user.getName());
            System.out.println("Estado: " + user.getStatus());
            System.out.println("Edad: " + user.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el usuario: " + e.getMessage());
        }
    }
}