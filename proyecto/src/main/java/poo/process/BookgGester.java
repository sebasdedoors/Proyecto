package poo.process;

import poo.data.Book;

import java.util.ArrayList;

import java.util.List;

public class BookGester {
    private List<Book> gester;

    public BookGester(){
        this.gester = new ArrayList<>();
    }

    public void addBook(String titulo, String genero, int edad){
        Book book = new Book(titulo, genero, edad);
        gester.add(book);
    }

    public List<Book> getBook(){return gester;}

    public Book showBook(String titulo){
        for(Book book : gester){
            if(book.getTitulo().equalsIgnoreCase(titulo)){
                return book;
            }
        } return null;
    }
}
