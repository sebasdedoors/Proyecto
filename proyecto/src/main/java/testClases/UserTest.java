package testClases;
import poo.data.User;
import org.junit.Test;

public class UserTest {
     @Test
    public void testValido() {
        User user = new User("Victor", 15);

        System.out.println("Nombre: " + user.getName());
        System.out.println("Estado: " + user.getStatus());
        System.out.println("Edad: " + user.getAge());
    }
}
