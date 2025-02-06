package poo.ui;

import java.util.Scanner;
import java.util.List;

import poo.process.BookGester;
import poo.process.UserGester;
import poo.data.Book;
import poo.data.User;

public class CLI {
    private Scanner scanner;
    private BookGester bookGester;
    private UserGester userGester;

    private void showMenu(){
        System.out.println("+------------------------+");
        System.out.println("| Menu: ");
        System.out.println("| 1. Agregar un Libro.");
        System.out.println("| 2. Agregar un usuario.");
        System.out.println("| 3. Mostrar libros.");
        System.out.println("| 4. Mostrar usuarios.");
        //* Muestra prestamos activos con fechas */
        /*Estados de usuarios */
        /*Editar información de libros */
        System.out.println("| 5. Salir");
        System.out.println("+------------------------+");
    }

    public CLI(){
        scanner = new Scanner(System.in);
        bookGester = new BookGester();
        userGester = new UserGester();
    }

    public void runApp(){
        while(true){
            showMenu();
            int opcion = scanner.nextInt();
            switch(opcion){
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
                    System.out.println("Gracias por visitarnos ;)...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no valida, por favor intente de nuevo.");
                    break;
            }
        }
    }

    private void listBook(){
        List<Book> gester = bookGester.getBook();
        if(gester.isEmpty()){
            System.out.println("No hay libros en la lista.");
        }else{
            for(Book book : gester){
                System.out.println("Titulo: " + book.getTitulo() + ", Genero: " + book.getGenero() + ", Edad recomendada: " + book.getEdad());
            }
        }
    }

    private void listUser(){
        List<User> gester = userGester.getUser();
        if(gester.isEmpty()){
            System.out.println("No hay usuarios en la lista.");
        }else{
            for(User user : gester){
                System.out.println("Usuario: " + user.getName() + "Estado: " + user.getStatus());
            }
        }
    }

    private void addBook(){
        try{
            System.out.println("Escriba el nombre del libro a agregar:");
            String titulo = scanner.nextLine();
            System.out.println("Escriba el genero del libro por favor:");
            String genero = scanner.nextLine();
            System.out.println("Escriba la edad a la que esta dirigido el libro por favor:");
            int edad  = scanner.nextInt();

            bookGester.addBook(titulo, genero, edad);
            System.out.println("Libro agregado exitosamente.");
        }catch(Exception e){
            System.out.println("Error al agregar el producto: " + e.getMessage());
        }
    }

    private void addUser(){
        try{
            System.out.println("Escriba el nombre de usuario por favor:");
            String name = scanner.nextLine();
            System.out.println("Escriba el estado del usuario por favor:");
            String status = scanner.nextLine();
            userGester.addUser(name, status);
            System.out.println("Usuario agregado con exito.");
        }catch(Exception e){
            System.out.println("Error al agregar el usuario: " + e.getMessage());
        }
    }
}