package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BibliotecaApp {

    private Biblioteca biblioteca;

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Go Dog Go", "Dr Suess", "1990"));
        books.add(new Book("Green Eggs and Ham", "Dr Suess", "1991"));
        Biblioteca biblioteca = new Biblioteca(books, System.out);
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);
        new BibliotecaApp(biblioteca, bufferedReader).run();
    }

    BibliotecaApp(Biblioteca biblioteca, BufferedReader bufferedReader){
        this.biblioteca = biblioteca;
    }

    public void run(){
        biblioteca.printWelcomeMessage();
        biblioteca.displayMenu();
    }

    public int getUserInput() {
        return 1;
    }
}
