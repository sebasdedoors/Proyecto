package poo.ui;

    /**
     * La clase Eng extiende la clase Lang y proporciona mensajes en inglés
     * para un sistema de gestión de libros y usuarios.
     */

    public class Eng extends Lang {
        
    public Eng(){

    EXIT = "Thank you for visiting us ;)...";
    MENU = "\u001B[1;34m"+"|             Menu:             |\n|         1. Add a book.        |\n|         2. Add a user.        |\n|         3. Show books.        |\n|         4. Show users.        |\n|            5. Tops.           |\n|         6. Lend Book.         |\n|        7. Return Book.        |\n|            8. Exit.           |"+"\u001B[0m";
    INVALID = "Invalid option, please try again.";
    ADDBOOK = "Enter the name of the book to add:";
    ADDUSER = "Enter the user's name, please:";
    NOBOOKS = "There are no books in the list.";
    NOUSERS = "There are no users in the list.";
    GOODBOOK = "The book was successfully added.";
    ERRBOOK = "Error adding the book: ";
    ERRORARCHIVE = "Error reading the file: ";
    GENERBOOK = "Enter the book genre, please:";
    AGEBOOK = "Enter the recommended age for the book:";
    STATUSUSER = "Enter the user's age, please:";
    GOODUSER = "The user was added successfully.";
    ERRUSER = "Error adding the user: ";
    USER = "Name: ";
    STATUS = "Status: ";
    TITLE = "Title: ";
    GENER = "Genre: ";
    AGE = "Recommended age: ";
    REQUESTUSER = "Enter the user's name: ";
    REQUESTBOOK = "Enter the name of the book to borrow: ";
    REQUESTAGE = "Enter the user's age: ";
    UNDERAGE = "As a Junior user, you cannot borrow books from the library.";
    MIDDLEAGE = "As a Teen user, you can only borrow one book for 7 days with a guarantor's approval.";
    LENDDAYS = "Enter the number of days to borrow: ";
    EXCEEDDAYS = "You cannot borrow a book for more than 7 days.";
    AVALNAME = "Enter the guarantor's name: ";
    NULLAVALNAME = "The guarantor name cannot be empty.";
    ONLYTWOBOOKS = "You can borrow 2 books for 15 days.";
    TIMELEND = "Enter the number of days to borrow:";
    }
}
