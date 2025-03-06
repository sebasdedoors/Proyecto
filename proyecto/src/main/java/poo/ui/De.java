package poo.ui;

    /**
     * La clase De extiende la clase Lang y proporciona mensajes en alemán
     * para un sistema de gestión de libros y usuarios.
     */
    public class De extends Lang {
   
    public De(){

        EXIT = "Danke für Ihren Besuch ;)...";
        MENU = "\u001B[1;31m"+"|             Menü:             |\n|    1. Ein Buch hinzufügen.    |\n| 2. Einen Benutzer hinzufügen. |\n|      3. Bücher anzeigen.      |\n|     4. Benutzer anzeigen.     |\n|         5. Toplisten          |\n|       6. Buch ausleihen       |\n|      7.  Buch zurückgeben     |\n|          8. Beenden.          |"+"\u001B[0m";
        INVALID = "Ungültige Option, bitte versuchen Sie es erneut.";
        ADDBOOK = "Geben Sie den Namen des hinzuzufügenden Buches ein:";
        ADDUSER = "Geben Sie den Namen des Benutzers ein:";
        NOBOOKS = "Es gibt keine Bücher in der Liste.";
        NOUSERS = "Es gibt keine Benutzer in der Liste.";
        GOODBOOK = "Das Buch wurde erfolgreich hinzugefügt.";
        ERRBOOK = "Fehler beim Hinzufügen des Buches: ";
        ERRORARCHIVE = "Fehler beim Lesen der Datei: ";
        GENERBOOK = "Geben Sie das Genre des Buches ein:";
        AGEBOOK = "Geben Sie das empfohlene Alter für das Buch ein:";
        STATUSUSER = "Geben Sie das Alter des Benutzers ein:";
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
        UNDERAGE = "Als Jr-Benutzer dürfen Sie keine Bücher ausleihen.";
        MIDDLEAGE = "Als Teen-Benutzer können Sie nur ein Buch für 7 Tage mit einem Bürgen ausleihen.";
        LENDDAYS = "Geben Sie die Anzahl der Ausleihtage ein: ";
        EXCEEDDAYS = "Sie können ein Buch nicht länger als 7 Tage ausleihen.";
        AVALNAME = "Geben Sie den Namen des Bürgen ein: ";
        NULLAVALNAME = "Der Name des Bürgen darf nicht leer sein.";
        ONLYTWOBOOKS = "Sie können bis zu 2 Bücher für 15 Tage ausleihen.";
        TIMELEND = "Geben Sie die Anzahl der Ausleihtage ein:";
        
        CREATEERRORUSER = "Fehler beim Erstellen des Benutzers.";
        ZEROAGE = "Das Alter muss größer als 0 sein.";
        NULLGENRE = "Das Feld darf nicht leer sein.";
        NULLTITLE = "Der Titel darf keine Zahlen enthalten und nicht leer sein.";
        ERRORUSEREXIST = "Fehler beim Test für nicht existierenden Benutzer: ";
        ERRORBOOKEXIST = "Fehler beim Test für nicht existierendes Buch: ";
        ERRORLEND = "Fehler beim Test der Ausleihe: ";
        ERRORREADARCHIVE = "Fehler beim Lesen der Datei: ";
        NOUNDERZERO = "Das Alter muss größer als 0 sein.";    
        UPONZERO = "Das Alter darf nicht kleiner als 0 sein.";
        NONULL = "Das Feld darf nicht leer sein.";
        NOZEROAGE = "Das Alter darf nicht 0 sein.";
        ONLYFOURDIGITS = "Die ID muss genau 4 Ziffern haben.";
        ERRORADDLEND = "Fehler beim Hinzufügen der Ausleihe.";
        THEBOOK = "Das Buch: ";
        WASLEND = " wurde ausgeliehen an ";
        WITHSUCCESS = " erfolgreich.";
        DESDE = " von ";
        HASTA = " bis ";
        ACTIVEES = "Aktiver Status.";
    }

}