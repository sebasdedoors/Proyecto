package poo.testClass;
import poo.data.User;
import poo.ui.Lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class UserTest {

        
        @Test
        public void testUserCreation(){
            User user = new User("Victor", 25);
            assertEquals("Victor", user.getName());
            assertEquals(25, user.getAge());
            assertEquals("Usuario Adult", user.getStatus());
        }

        @Test
        public void testSetNameValid(){
            User user = new User("Victor", 25);
            user.setName("Carlos");
            assertEquals("Carlos", user.getName());
        }

        @Test
        public void testSetNameInvalid(){
            User user = new User("Victor", 25);
            assertThrows(IllegalArgumentException.class, () -> {
                user.setName("");
            });
        }

        @Test
        public void testSetAgeValid(){
            User user = new User("Victor", 25);
            user.setAge(30);
            assertEquals(30, user.getAge());
        }

        @Test
        public void testSetAgeInvalid(){
            User user = new User("Victor", 25);
            assertThrows(IllegalArgumentException.class, () -> {
                user.setAge(0);
            });
        }

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
