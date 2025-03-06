package poo.testClass;
import poo.data.User;
import poo.ui.Lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class UserTest {

        /*Este metodo se asegura de que se cree un nuevo libro pidiendo de regeso sus parametros. */
        @Test
        public void testUserCreation(){
            User user = new User("Victor", 25);
            assertEquals("Victor", user.getName());
            assertEquals(25, user.getAge());
            assertEquals("Usuario Adult", user.getStatus());
        }

        /*Este metodo se asegura de que el nombre sea puesto de manera correcta. */
        @Test
        public void testSetNameValid(){
            User user = new User("Victor", 25);
            user.setName("Carlos");
            assertEquals("Carlos", user.getName());
        }

        /*Este metodo se asegura de que el usuario reciba el mensaje de error al colocar un dato erroneo. */
        @Test
        public void testSetNameInvalid(){
            User user = new User("Victor", 25);
            assertThrows(IllegalArgumentException.class, () -> {
                user.setName("");
            });
        }

        /*Este metodo se asegura de colocar la edad que fue enviada. */
        @Test
        public void testSetAgeValid(){
            User user = new User("Victor", 25);
            user.setAge(30);
            assertEquals(30, user.getAge());
        }

        /*Este metodo se asegura de que el usuario reciba el mensaje de error. */
        @Test
        public void testSetAgeInvalid(){
            User user = new User("Victor", 25);
            assertThrows(IllegalArgumentException.class, () -> {
                user.setAge(0);
            });
        }

        /*Este metodo se asegura de que se colocque el estatus correcto al usuario. */
        @Test
        public void testSetStatus(){
            User userChild = new User("Daniela", 10);
            assertEquals("Usuario Jr", userChild.getStatus());

            User userTeen = new User("Daniela", 15);
            assertEquals("Usuario Teen", userTeen.getStatus());

            User userAdult = new User("Daniela", 20);
            assertEquals("Usuario Adult", userAdult.getStatus());
        }
    }
