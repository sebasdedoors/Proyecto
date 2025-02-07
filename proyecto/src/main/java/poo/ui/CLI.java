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
        //* Menu para poder selecionar idiamas*/
        System.out.println("\u001B[1;37m"+"+------------------------------------------------------------------------------------------------------------------+");
        System.out.println("| Bienvenido a la biblioteca virtual! | Welcome to the virtual library! | Willkommen in der virtuellen Bibliothek! |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                          Select a language / Seleccione un idioma / Wählen Sie eine Sprache:                     |");
        System.out.println("|                                                  1. Español                                                      |");
        System.out.println("|                                                  2. English                                                      |");
        System.out.println("|                                                  3. Deutsch                                                      |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------+"+"\u001B[0m");
                

        int option = scanner.nextInt();
        scanner.nextLine(); //* Consumir el salto de línea y elecion de idiomas*/

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
            messages.put("goodBook", "Libro agregado exitosamente.");
            messages.put("errBook", "Error al agregar el libro: ");
            messages.put("generBook", "Escriba el genero del libro por favor:");
            messages.put("ageBook", "Escriba la edad recomendada del libro:");
            messages.put("statusUser", "Escriba el estado del usuario por favor: ");
            messages.put("goodUser","El  usuario se agregó con exito.");
            messages.put("errUser", "Erro al agregar el usuario: ");
            messages.put("user", "Nombre: ");
            messages.put("status", "Estado: ");
            messages.put("title", "Titulo: ");
            messages.put("gener", "Genero: ");
            messages.put("age","Edad recomendada: ");
        } else if (language.equals("en")) {
            messages.put("menu", "\u001B[1;33m"+"|             Menu:            |\n|        1. Add a Book.        |\n|        2. Add a User..       |\n|        3. Show books..       |\n|        4. Show users..       |\n|           5. Exit            |"+"\u001B[0m");
            messages.put("exit", "Thank you for visiting us ;)...");
            messages.put("invalid", "Invalid option, please try again.");
            messages.put("addBook", "Enter the name of the book to add:");
            messages.put("addUser", "Enter the username, please:");
            messages.put("noBooks", "There are no books in the list.");
            messages.put("noUsers", "There are no users in the list.");
            messages.put("goodBook", "The books was added succesfully.");
            messages.put("errBook", "There was an error in the creation: ");
            messages.put("generBook", "Type the book's gener please:");
            messages.put("ageBook", "Write the recommended age of this book:");
            messages.put("statusUser", "Write the user's status please: ");
            messages.put("goodUser","The user was added succesfully.");
            messages.put("errUser", "Error in adding the user: ");
            messages.put("user", "Name: ");
            messages.put("status", "Status: ");
            messages.put("title", "Title: ");
            messages.put("gener", "Gener: ");
            messages.put("age","Age recommended: ");
        } else if (language.equals("de")) {
            messages.put("menu", "\u001B[1;31m"+"|             Menü:            |\n|    1. Ein Buch hinzufügen.   |\n| 2. Einen Benutzer hinzufügen.|\n|      3. Bücher anzeigen.     |\n|     4. Benutzer anzeigen.    |\n|          5. Beenden          |"+"\u001B[0m");
            messages.put("exit", "Danke für Ihren Besuch ;)...");
            messages.put("invalid", "Ungültige Option, bitte versuchen Sie es erneut.");
            messages.put("addBook", "Geben Sie den Namen des Buches ein, das hinzugefügt werden soll:");
            messages.put("addUser", "Geben Sie den Benutzernamen ein, bitte:");
            messages.put("noBooks", "Es gibt keine Bücher in der Liste.");
            messages.put("noUsers", "Es gibt keine Benutzer in der Liste.");
            messages.put("goodBook", "Das buch wurde erfolgreich hinzugefügt.");
            messages.put("errBook", "Fehler beim hinzufügen zum buch: ");
            messages.put("generBook", "Schreiben sie bitte das genre des buches:");
            messages.put("ageBook", "Schreiben sie das empfohlene alter dieses buches");
            messages.put("statusUser", "Bitte geben Sie den Benutzerstatus ein: ");
            messages.put("goodUser","Der Benutzer wurde erfolgreich hinzugefügt.");
            messages.put("errUser", "Fehler beim Hinzufügen des Benutzers: ");
            messages.put("user", "Name: ");
            messages.put("status", "Zustand: ");
            messages.put("title", "Qualifikation: ");
            messages.put("gener", "Geschlecht: ");
            messages.put("age","Alter: ");
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
                System.out.println(messages.get("title") + book.getTitulo() + messages.get("gener") + book.getGenero() + messages.get("age") + book.getEdad());
            }
        }
    }

    private void listUser() {
        List<User> gester = userGester.getUser();
        if (gester.isEmpty()) {
            System.out.println(messages.get("noUsers"));
        } else {
            for (User user : gester) {
                System.out.println(messages.get("user") + user.getName() + messages.get("status") + user.getStatus());
            }
        }
    }

    private void addBook() {
        try {
            System.out.println(messages.get("addBook"));
            String titulo = scanner.nextLine();
            System.out.println(messages.get("generBook"));
            String genero = scanner.nextLine();
            System.out.println(messages.get("ageBook"));
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            bookGester.addBook(titulo, genero, edad);
            System.out.println(messages.get("goodBook"));
        } catch (Exception e) {
            System.out.println(messages.get("errBook") + e.getMessage());
        }
    }

    private void addUser() {
        try {
            System.out.println(messages.get("addUser"));
            String name = scanner.nextLine();
            System.out.println(messages.get("statusUser"));
            String status = scanner.nextLine();
            userGester.addUser(name, status);
            System.out.println(messages.get("goodUser"));
        } catch (Exception e) {
            System.out.println(messages.get("errUser") + e.getMessage());
        }
    }
}
