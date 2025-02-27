package poo.data;

import java.beans.Transient;

import org.junit.Test;

/**
 * La clase User representa a un usuario con un nombre y un estado. 
 * Esta clase incluye métodos para obtener y establecer estos valores, 
 * así como validaciones para asegurarse de que los valores sean correctos.
 */

public class User {
    
    private String name;
    private String status;
    private int age;

    /**
     * Constructor de la clase User. Crea una nueva instancia de un usuario con un nombre y estado.
     * @param name El nombre del usuario.
     * @param status El estado del usuario.
     * @param age La edad del usuario.
     * @throws IllegalArgumentException Si el nombre o el estado están vacíos o son nulos, arroja una excepción.
     */

    public User(String name, int age){
        setName(name);
        setStatus(age);
        setAge(age);
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */

    public String getName(){
        return name;
    }

    /**
     * Obtiene el estado del usuario.
     * @return El estado del usuario.
     */

    public String getStatus(){
        return status;
    }

    /**
     * Obtiene la edad del usuario.
     * @return La edad del usuario.
     */
    public int getAge(){
        return age;
    }

    /**
     * Establece el nombre del usuario. Valida que el nombre no esté vacío ni sea nulo.
     * @param name Es la variable del nombre del usuario.
     * @throws IllegalArgumentException Si el nombre está vacío o es nulo, arroja una excepción.
     */

    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("El espacio no debe de estar vacio.");
        }else{
            this.name = name;
        }
    }

    /**
     * Establece la edad del usuario. Valida que la edad no sea menor o igual a 0.
     * @param age Es la variable de la edad del usuraio.
     * @throws IllegalArgumentException Si la edad es menor o igual a 0, arroja una excepción.
     */
    public void setAge(int age){
        if (age <= 0){
            throw new IllegalArgumentException("La edad no puede ser menor a 0. ");
        } else {
        this.age = age;
    }
}
    /**
     * Establece el estado del usuario. Valida que el estado no esté vacío ni sea nulo.
     * @param status Es la variable del estado del usuario.
     * @throws IllegalArgumentException Si el estado está vacío o es nulo, arroja una excepción.
     */

     /**
      * Establece a el usuario su esataus dependiendo su edad.
      * 
      */
    public String setStatus(int age){
        if (age >=6 && age <= 12){
            if(age == 0){
                throw new IllegalArgumentException("La edad no puede ser 0.");
            }else{
                this.status = "Usuario Jr";
                return status;
            }
        }
        if (age >= 13 && age <= 17){
            if(age == 0){
                throw new IllegalArgumentException("La edad no puede ser 0.");
            }else{
                this.status = "Usuario Teen";
                return status;
            }
        }
        else{
            this.status = "Usuario Adult";
            return status;
        }
        
    }
}

class UserTest { /*Esto va en una clase aparte. */
    @Test
    public void testValido(){
        User user = new User ("Victor", 15);
        assertEquals("Victor", user.getName());
        assertEquals("Usuario Teen", user.getStatus());
        assertEqueals(15, user.getAge());
    }
}