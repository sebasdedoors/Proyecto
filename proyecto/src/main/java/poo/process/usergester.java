package poo.process;

import poo.data.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * La clase UserGester gestiona una colección de usuarios, permitiendo agregar y recuperar usuarios según su nombre.
 */

public class UserGester {

    /**
     * Agrega un nuevo usuario a la lista de usuarios gestionados.
     *
     * @param name   Es la variable del nombre del usuario.
     * @param status Es la variable del estado del usuario.
     */

    public void addUser(String name, int age) {
        User user = new User(name, age);
        String fileName = "User.txt";
        String content = "\n" + toString(user);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
            bw.write(content);
        } catch (IOException e){
            System.out.println(lang.ERRBOOK+ e.getMessage());
        }
    }

    private String toString(User user){
        return user.getName() + "; " + user.getAge() + "; " + user.getStatus(); 
    } 
}
