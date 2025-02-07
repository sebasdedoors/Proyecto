package poo.data;

/**
 * La clase User representa a un usuario con un nombre y un estado. 
 * Esta clase incluye métodos para obtener y establecer estos valores, 
 * así como validaciones para asegurarse de que los valores sean correctos.
 */

public class User {
    
    private String name;
    private String status;

    /**
     * Constructor de la clase User. Crea una nueva instancia de un usuario con un nombre y estado.
     * @param name El nombre del usuario.
     * @param status El estado del usuario.
     * @throws IllegalArgumentException Si el nombre o el estado están vacíos o son nulos, arroja una excepción.
     */

    public User(String name, String status){
        setName(name);
        setStatus(status);
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
     * Establece el estado del usuario. Valida que el estado no esté vacío ni sea nulo.
     * @param status Es la variable del estado del usuario.
     * @throws IllegalArgumentException Si el estado está vacío o es nulo, arroja una excepción.
     */

    public void setStatus(String status){
        if(status == null || status.isEmpty()){
            throw new IllegalArgumentException("No puede quedarse vacio este espacio.");
        }else{
            this.status = status;
        }
    }
}
