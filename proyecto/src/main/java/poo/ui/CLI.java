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

public class CLI {
    private Scanner scanner;
    private BookGester bookGester;
    private UserGester userGester;
    private Map<String, String> messages;
    private String language;
    private Lang lang;

    public CLI() { 
        scanner = new Scanner(System.in);
        bookGester = new BookGester();
        userGester = new UserGester();
        selectLanguage();
    }

    public CLI(Lang lang){
        this.lang = lang;
        this.scanner = new Scanner(System.in);
        bookGester = new BookGester();
        userGester = new UserGester();
    }

    public void selectLanguage() {
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



        private void showMenu() {
            System.out.println("\u001B[1;30m"+"+------------------------------+");
            System.out.println(lang.MENU);
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
                    System.out.println(lang.EXIT);
                    System.exit(0);
                    break;
                default:
                    System.out.println(lang.INVALID);
                    break;
            }
        }
    }

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

    private void addBook() {
        try {
            System.out.println(lang.ADDBOOK);
            String titulo = scanner.nextLine();
            System.out.println(lang.GENERBOOK);
            String genero = scanner.nextLine();
            System.out.println(lang.AGEBOOK);
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            bookGester.addBook(titulo, genero, edad);
            System.out.println(lang.GOODBOOK);
        } catch (Exception e) {
            System.out.println(lang.ERRBOOK + e.getMessage());
        }
    }

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
