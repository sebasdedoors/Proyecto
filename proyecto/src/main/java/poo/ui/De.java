package poo.ui;

    /**
     * La clase De extiende la clase Lang y proporciona mensajes en alemán
     * para un sistema de gestión de libros y usuarios.
     */
    public class De extends Lang {
   
    public De(){

        EXIT = "Danke für Ihren Besuch ;)...";
        MENU = "\u001B[1;31m"+"|             Menü:             |\n|    1. Ein Buch hinzufügen.   |\n| 2. Einen Benutzer hinzufügen.|\n|      3. Bücher anzeigen.     |\n|     4. Benutzer anzeigen.    |\n|          5. Beenden.         |"+"\u001B[0m";
        INVALID = "Ungültige Option, bitte versuchen Sie es erneut.";
        ADDBOOK = "Geben Sie den Namen des Buches ein, das hinzugefügt werden soll:";
        ADDUSER = "Geben Sie den Namen des Benutzers ein, bitte:";
        NOBOOKS = "Es gibt keine Bücher in der Liste.";
        NOUSERS = "Es gibt keine Benutzer in der Liste.";
        GOODBOOK = "Das Buch wurde erfolgreich hinzugefügt.";
        ERRORARCHIVE = "Fehler beim Lesen der Datei: ";
        GENERBOOK = "Geben Sie bitte das Genre des Buches ein:";
        AGEBOOK = "Geben Sie das empfohlene Alter für das Buch ein:";
        STATUSUSER = "Geben Sie bitte das Alter des Benutzers ein:";
        GOODUSER = "Der Benutzer wurde erfolgreich hinzugefügt.";
        ERRUSER = "Fehler beim Hinzufügen des Benutzers: ";
        USER = "Name: ";
        STATUS = "Status: ";
        TITLE = "Titel: ";
        GENER = "Genre: ";
        AGE = "Empfohlenes Alter: ";
        REQUESTUSER = "Geben Sie den Namen des Benutzers ein: ";
        REQUESTBOOK = "Geben Sie den Namen des auszuleihenden Buches ein: ";
        REQUESTAGE = "Geben Sie das Alter des Benutzers ein: ";
        UNDERAGE = "Als Junior-Benutzer können Sie keine Bücher aus der Bibliothek ausleihen.";
        MIDDLEAGE = "Als Teen-Benutzer können Sie nur ein Buch für 7 Tage mit der Genehmigung eines Bürgen ausleihen.";
        LENDDAYS = "Geben Sie die Anzahl der Ausleihtage ein: ";
        EXCEEDDAYS = "Sie können ein Buch nicht länger als 7 Tage ausleihen.";
        AVALNAME = "Geben Sie den Namen des Bürgen ein: ";
        NULLAVALNAME = "Der Name des Bürgen darf nicht leer sein.";
        ONLYTWOBOOKS = "Sie können 2 Bücher für 15 Tage ausleihen.";
        TIMELEND = "Geben Sie die Anzahl der Ausleihtage ein:";
        
    
    }
}
