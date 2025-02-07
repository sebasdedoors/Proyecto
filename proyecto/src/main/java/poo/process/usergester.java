package poo.process;

import poo.data.User;

import java.util.ArrayList;

import java.util.List;


/**
 * La clase UserGester gestiona una colección de usuarios, permitiendo agregar y recuperar usuarios según su nombre.
 */

public class UserGester {
    /**
     * Lista que almacena los usuarios gestionados por la clase.
     */

    private List<User> gester;

    /**
     * Constructor de la clase UserGester.  
     * Inicializa la lista de usuarios.
     */

    public UserGester() {
        this.gester = new ArrayList<>();
    }

    /**
     * Agrega un nuevo usuario a la lista de usuarios gestionados.
     *
     * @param name   Es la variable del nombre del usuario.
     * @param status Es la variable del estado del usuario.
     */

    public void addUser(String name, String status) {
        User user = new User(name, status);
        gester.add(user);
    }

    /**
     * Obtiene la lista de usuarios almacenados en la colección.
     *
     * @return Una lista de objetos {@link User}.
     */

    public List<User> getUser() {
        return gester;
    }

    /**
     * Busca un usuario en la colección por su nombre.
     *
     * @param name Es la variable del nombre del usuario a buscar.
     * @return El usuario encontrado o {@code null} si no se encuentra.
     */

    public User showUser(String name) {
        for (User user : gester) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }
}
