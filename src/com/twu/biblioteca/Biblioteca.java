package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by dlafeir on 6/16/15.
 */
public class Biblioteca {
    private List<Book> books;
    private PrintStream printStream;

    Biblioteca(List<Book> books, PrintStream printStream){
        this.books = books;
        this.printStream = printStream;
    }

    public void printWelcomeMessage() {
        printStream.println("Welcome to the Biblioteca!");
    }

    public void printListOfBooks() {
        if(!books.isEmpty()){
            printStream.println("BookName");
        } else {
            printStream.println("");
        }
    }
}
