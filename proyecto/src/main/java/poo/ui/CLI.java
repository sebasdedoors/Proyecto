package poo.ui;

import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import poo.process.BookGester;
import poo.process.UserGester;
import poo.data.Book;
import poo.data.User;
import poo.ui.Lang;

/**
 * Clase CLI que representa la interfaz de línea de comandos para una biblioteca virtual.
 * Permite la gestión de libros y usuarios, además de la selección de idioma.
 */

public class CLI {
    
    private Scanner scanner;
    private BookGester bookGester;
    private UserGester userGester;
    private String language;
    private Lang lang;
    
    /**
     * Constructor de CLI que inicializa los gestores y solicita la selección del idioma.
     */

    public CLI() {
        scanner = new Scanner(System.in);
        bookGester = new BookGester();
        userGester = new UserGester();
        selectLanguage();
    }
    
    /**
     * Constructor de CLI que recibe un objeto Lang para establecer el idioma.
     * @param lang Instancia del idioma seleccionado.
     */

    public CLI(Lang lang) {
        this.lang = lang;
        this.scanner = new Scanner(System.in);
        bookGester = new BookGester();
        userGester = new UserGester();
    }
    
    /**
     * Método que muestra un menú para seleccionar el idioma de la aplicación.
     */

    public void selectLanguage() {
        System.out.println("+------------------------------------------------------------------------------------------------------------------+");
        System.out.println("| Bienvenido a la biblioteca virtual! | Welcome to the virtual library! | Willkommen in der virtuellen Bibliothek! |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                          Select a language / Seleccione un idioma / Wählen Sie eine Sprache:                     |");
        System.out.println("|                                                  1. Español                                                      |");
        System.out.println("|                                                  2. English                                                      |");
        System.out.println("|                                                  3. Deutsch                                                      |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------+");
        
        int option = scanner.nextInt();
        scanner.nextLine(); 
        
        switch (option) {
            case 1:
                lang = new Esp();
                break;
            case 2:
                lang = new Eng();
                break;
            case 3:
                lang = new De();
                break;
            default:
                System.out.println("Opción no válida. Español por defecto.");
                lang = new Esp();
        }
    }
    
    /**
     * Método que muestra el menú principal de opciones de la biblioteca virtual.
     */

    private void showMenu() {
        System.out.println("+------------------------------+");
        System.out.println(lang.MENU);
        System.out.println("+------------------------------+");
    }
    
    /**
     * Método que ejecuta el ciclo principal de la aplicación, permitiendo la interacción del usuario con la biblioteca virtual.
     */

    public void runApp() {
        while (true) {
            showMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            
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
                    System.out.println(lang.EXIT);
                    System.exit(0);
                    break;
                default:
                    System.out.println(lang.INVALID);
                    break;
            }
        }
    }
    
    /**
     * Método que muestra la lista de libros almacenados en la biblioteca virtual.
     */

    private void listBook() {
        List<Book> gester = bookGester.getBook();
        if (gester.isEmpty()) {
            System.out.println(lang.NOBOOKS);
        } else {
            for (Book book : gester) {
                System.out.println(lang.TITLE + book.getTitulo() + lang.GENER + book.getGenero() + lang.AGE + book.getEdad());
            }
        }
    }
    
    /**
     * Método que muestra la lista de usuarios registrados en la biblioteca virtual.
     */

    private void listUser() {
        List<User> gester = userGester.getUser();
        if (gester.isEmpty()) {
            System.out.println(lang.NOUSERS);
        } else {
            for (User user : gester) {
                System.out.println(lang.USER + user.getName() + lang.STATUS + user.getStatus());
            }
        }
    }
    
    /**
     * Método que permite añadir un nuevo libro a la biblioteca virtual.
     */

    private void addBook() {
        try {
            System.out.println(lang.ADDBOOK);
            String titulo = scanner.nextLine();
            System.out.println(lang.GENERBOOK);
            String genero = scanner.nextLine();
            System.out.println(lang.AGEBOOK);
            int edad = scanner.nextInt();
            scanner.nextLine(); 
            
            bookGester.addBook(titulo, genero, edad);
            System.out.println(lang.GOODBOOK);
        } catch (Exception e) {
            System.out.println(lang.ERRBOOK + e.getMessage());
        }
    }
    
    /**
     * Método que permite añadir un nuevo usuario a la biblioteca virtual.
     */

    private void addUser() {
        try {
            System.out.println(lang.ADDUSER);
            String name = scanner.nextLine();
            System.out.println(lang.STATUSUSER);
            String status = scanner.nextLine();
            userGester.addUser(name, status);
            System.out.println(lang.GOODUSER);
        } catch (Exception e) {
            System.out.println(lang.ERRUSER + e.getMessage());
        }
    }
}