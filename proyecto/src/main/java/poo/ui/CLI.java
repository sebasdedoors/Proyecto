package poo.ui;

import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import poo.process.BookGester;
import poo.process.UserGester;
import poo.data.Book;
import poo.data.User;

public class CLI {
    private Scanner scanner;
    private BookGester bookGester;
    private UserGester userGester;
    private Map<String, String> messages;
    private String language;

    public CLI() {
        scanner = new Scanner(System.in);
        bookGester = new BookGester();
        userGester = new UserGester();
        selectLanguage();
    }

    private void selectLanguage() {
        // Solicitar idioma
        System.out.println("\u001B[1;37m"+"+------------------------------------------------------------------------------------------------------------------+");
        System.out.println("| Bienvenido a la biblioteca virtual! | Welcome to the virtual library! | Willkommen in der virtuellen Bibliothek! |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                          Select a language / Seleccione un idioma / Wählen Sie eine Sprache:                     |");
        System.out.println("|                                                  1. Español                                                      |");
        System.out.println("|                                                  2. English                                                      |");
        System.out.println("|                                                  3. Deutsch                                                      |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------+"+"\u001B[0m");
                

        int option = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (option) {
            case 1:
                language = "es";
                break;
            case 2:
                language = "en";
                break;
            case 3:
                language = "de";
                break;
            default:
                System.out.println("Opción no válida. Español por defecto.");
                language = "es";
        }

        loadMessages();
    }

    private void loadMessages() {
        messages = new HashMap<>();

        if (language.equals("es")) {
            messages.put("menu", "\u001B[1;34m"+"|             Menu:            |\n|     1. Agregar un Libro.     |\n|    2. Agregar un usuario.    |\n|      3. Mostrar libros.      |\n|     4. Mostrar usuarios.     |\n|           5. Salir           |"+"\u001B[0m");
            messages.put("exit", "Gracias por visitarnos ;)... ");
            messages.put("invalid", "Opción no válida, por favor intente de nuevo.");
            messages.put("addBook", "Escriba el nombre del libro a agregar:");
            messages.put("addUser", "Escriba el nombre de usuario por favor:");
            messages.put("noBooks", "No hay libros en la lista.");
            messages.put("noUsers", "No hay usuarios en la lista.");
        } else if (language.equals("en")) {
            messages.put("menu", "\u001B[1;33m"+"|             Menu:            |\n|        1. Add a Book.        |\n|        2. Add a User..       |\n|        3. Show books..       |\n|        4. Show users..       |\n|           5. Exit            |"+"\u001B[0m");
            messages.put("exit", "Thank you for visiting us ;)...");
            messages.put("invalid", "Invalid option, please try again.");
            messages.put("addBook", "Enter the name of the book to add:");
            messages.put("addUser", "Enter the username, please:");
            messages.put("noBooks", "There are no books in the list.");
            messages.put("noUsers", "There are no users in the list.");
        } else if (language.equals("de")) {
            messages.put("menu", "\u001B[1;31m"+"|             Menü:            |\n|    1. Ein Buch hinzufügen.   |\n| 2. Einen Benutzer hinzufügen.|\n|      3. Bücher anzeigen.     |\n|     4. Benutzer anzeigen.    |\n|          5. Beenden          |"+"\u001B[0m");
            messages.put("exit", "Danke für Ihren Besuch ;)...");
            messages.put("invalid", "Ungültige Option, bitte versuchen Sie es erneut.");
            messages.put("addBook", "Geben Sie den Namen des Buches ein, das hinzugefügt werden soll:");
            messages.put("addUser", "Geben Sie den Benutzernamen ein, bitte:");
            messages.put("noBooks", "Es gibt keine Bücher in der Liste.");
            messages.put("noUsers", "Es gibt keine Benutzer in der Liste.");
        }
        
        }
        
    
    

        private void showMenu() {
            System.out.println("\u001B[1;30m"+"+------------------------------+");
            System.out.println(messages.get("menu"));
            System.out.println("\u001B[1;30m"+"+------------------------------+");
    }

    public void runApp() {
        while (true) {
            showMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addUser();
                    break;
                case 3:
                    listBook();
                    break;
                case 4:
                    listUser();
                    break;
                case 5:
                    System.out.println(messages.get("exit"));
                    System.exit(0);
                    break;
                default:
                    System.out.println(messages.get("invalid"));
                    break;
            }
        }
    }

    private void listBook() {
        List<Book> gester = bookGester.getBook();
        if (gester.isEmpty()) {
            System.out.println(messages.get("noBooks"));
        } else {
            for (Book book : gester) {
                System.out.println("Titulo: " + book.getTitulo() + ", Genero: " + book.getGenero() + ", Edad recomendada: " + book.getEdad());
            }
        }
    }

    private void listUser() {
        List<User> gester = userGester.getUser();
        if (gester.isEmpty()) {
            System.out.println(messages.get("noUsers"));
        } else {
            for (User user : gester) {
                System.out.println("Usuario: " + user.getName() + " Estado: " + user.getStatus());
            }
        }
    }

    private void addBook() {
        try {
            System.out.println(messages.get("addBook"));
            String titulo = scanner.nextLine();
            System.out.println("Escriba el genero del libro por favor:");
            String genero = scanner.nextLine();
            System.out.println("Escriba la edad a la que esta dirigido el libro por favor:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            bookGester.addBook(titulo, genero, edad);
            System.out.println("Libro agregado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al agregar el libro: " + e.getMessage());
        }
    }

    private void addUser() {
        try {
            System.out.println(messages.get("addUser"));
            String name = scanner.nextLine();
            System.out.println("Escriba el estado del usuario por favor:");
            String status = scanner.nextLine();
            userGester.addUser(name, status);
            System.out.println("Usuario agregado con éxito.");
        } catch (Exception e) {
            System.out.println("Error al agregar el usuario: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.runApp();
    }
}
