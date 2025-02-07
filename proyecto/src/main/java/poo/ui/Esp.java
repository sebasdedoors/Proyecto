package poo.ui;

    /**
     * La clase Esp extiende la clase Lang y proporciona mensajes en español
     * para un sistema de gestión de libros y usuarios.
     */

    public class Esp extends Lang {
    
    public Esp(){
        EXIT = "Gracias por visitarnos ;)...";
        MENU = "\u001B[1;34m"+"|             Menu:             |\n|      1.Agregar un libro.     |\n|    2. Agregar un usuario.    |\n|      3. Mostrar libros.      |\n|     4. Mostrar usuarios.     |\n|           5.Salir.           |"+"\u001B[0m";
        INVALID = "Opción no valida, por favor intente de nuevo.";
        ADDBOOK = "Escriba el nombre del libro a agregar:";
        ADDUSER = "Escribe el nombre del usuario por favor:";
        NOBOOKS = "No hay libros en la lista.";
        NOUSERS = "No hay usuarios en la lista.";
        GOODBOOK = "El libro agregado excistosamente.";
        ERRBOOK = "Error al agregar el libro: ";
        GENERBOOK = "Escriba el genero el libro por favor:";
        AGEBOOK = "Escribe la edad recomendada del libro:";
        STATUSUSER = "Escriba el estado del usuario por favor:";
        GOODUSER = "El usuario se agregó con exito.";
        ERRUSER = "Error al agregar el usuario: ";
        USER = "Nombre: ";
        STATUS = "Estado: ";
        TITLE = "Titulo: ";
        GENER = "Genero: ";
        AGE = "Edad recomandada: ";
    }

}
