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
    ADDUSER = "Enter the name of the user:";
    NOBOOKS = "There are no books in the list.";
    NOUSERS = "There are no users in the list.";
    GOODBOOK = "The book was added successfully.";
    ERRBOOK = "Error adding the book: ";
    ERRORARCHIVE = "Error reading the file: ";
    GENERBOOK = "Enter the genre of the book:";
    AGEBOOK = "Enter the recommended age for the book:";
    STATUSUSER = "Enter the user's age:";
    GOODUSER = "The user was added successfully.";
    ERRUSER = "Error adding the user: ";
    USER = "Name: ";
    STATUS = "Status: ";
    TITLE = "Title: ";
    GENER = "Genre: ";
    AGE = "Recommended age: ";
    REQUESTUSER = "Enter the name of the user: ";
    REQUESTBOOK = "Enter the name of the book to lend: ";
    REQUESTAGE = "Enter the user's age: ";
    UNDERAGE = "As a Jr user, you cannot borrow books from the library.";
    MIDDLEAGE = "As a Teen user, you can only borrow one book for 7 days with a guarantor.";
    LENDDAYS = "Enter the number of days to lend: ";
    EXCEEDDAYS = "You cannot borrow a book for more than 7 days.";
    AVALNAME = "Enter the name of the guarantor: ";
    NULLAVALNAME = "The guarantor's name cannot be empty.";
    ONLYTWOBOOKS = "You can borrow up to 2 books for 15 days.";
    TIMELEND = "Enter the number of days to lend:";
    CREATEERRORUSER = "Error creating the user.";
    ZEROAGE = "Age must be greater than 0.";
    NULLGENRE = "The field cannot be blank.";
    NULLTITLE = "The title cannot contain numbers or be empty.";
    ERRORUSEREXIST = "Error in non-existent user test: ";
    ERRORBOOKEXIST = "Error in non-existent book test: ";
    ERRORLEND = "Error in loan test: ";
    ERRORREADARCHIVE = "Error reading the file: ";
    NOUNDERZERO = "Age must be greater than 0.";    
    UPONZERO = "Age cannot be less than 0.";
    NONULL = "The field cannot be empty.";
    NOZEROAGE = "Age cannot be 0.";
    ONLYFOURDIGITS = "The ID must have exactly 4 digits.";
    ERRORADDLEND = "Error adding the loan.";
    THEBOOK = "The book: ";
    WASLEND = " was lent to ";
    WITHSUCCESS = " successfully.";
    DESDE = " from ";
    HASTA = " to ";
    ACTIVEES = "Active status.";
    }

}