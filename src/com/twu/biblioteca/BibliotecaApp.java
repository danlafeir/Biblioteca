package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private Biblioteca biblioteca;

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Go Dog Go", "Dr Suess", "1990"));
        books.add(new Book("Green Eggs and Ham", "Dr Suess", "1991"));
        Biblioteca biblioteca = new Biblioteca(books, System.out);
        new BibliotecaApp(biblioteca).run();
    }

    BibliotecaApp(Biblioteca biblioteca){
        this.biblioteca = biblioteca;
    }

    public void run(){
        biblioteca.printWelcomeMessage();
        biblioteca.displayMenu();
    }


}
