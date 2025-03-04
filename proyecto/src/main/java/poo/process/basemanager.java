package poo.process;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import poo.data.Book;
import poo.data.User;

public class BaseManager {
    private List<String> borrows = new ArrayList<>();
    private LocalDateTime today = LocalDateTime.now();

    public void makeBorrow(String user, String book, int days){
        if(searchBook(book) && searchUser(user)){
            borrows.add(user + "; " + book + "; Desde: " + today.getYear() + " - " + today.getMonthValue() + " - " + today.getDayOfMonth() + ". Hasta: " +  today.plusDays(days).getYear() + " - " + today.plusDays(days).getMonthValue() + " - " + today.plusDays(days).getDayOfMonth() + "; Estado: Activo");

            String fileName = "Borrows.txt";
            String content = "\n" + user + "; " + book + "; Desde: " + today.getYear() + " - " + today.getMonthValue() + " - " + today.getDayOfMonth() + ". Hasta: " +  today.plusDays(days).getYear() + " - " + today.plusDays(days).getMonthValue() + " - " + today.plusDays(days).getDayOfMonth() + "; Estado: Activo";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
                bw.write(content);
                bw.newLine();
                System.out.println("El libro " + book + " ha sido prestado a " + user + " con éxito.");
            }catch (IOException e){
                System.out.println("Error al agregar el prestamo");
                e.printStackTrace();
            }
        }
    }


    private static boolean searchBook(String book){
        try(BufferedReader br = new BufferedReader(new FileReader("Book.txt"))){
            String line;
            while((line = br.readLine()) != null){
                if(line.contains(book)){
                    return true;
                }
            }
        }catch (IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
            return false;
    }

    private static boolean searchUser(String user){
        try(BufferedReader br = new BufferedReader(new FileReader("User.txt"))){
            String line;
            while((line = br.readLine()) != null){
                if(line.contains(user)){
                    return true;
                }
            }
        } catch (IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    public void returnBorrows(){
        try(BufferedReader br = new BufferedReader(new FileReader("Borrows.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }
}
