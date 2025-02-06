package poo.ui;

import java.util.Scanner;

public class CLI { 
    private static void showMenu(){
        System.out.println(" Menu: ");
        System.out.println(" 1. Agregar un Libro");
        System.out.println(" 2. Mostrar libros");
        //* Muestren los usuarios */
        //* Muestra prestamos activos con fechas */
        /*Estados de usuarios */
        /*Editar información de libros */
        System.out.println(" 3. Salir");
    }
    /*Este metodo se encarga de generar el menu para el usuario. */
    public static void runApp(){
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
        while(option != 3){
            switch(option){
                case 1:
                System.out.println("Ingrese el nombre del libro: ");
                    break;
                case 2:
                    System.out.println("Libros que se han agregado: ");
                    break;
                case 3:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
    }
}



