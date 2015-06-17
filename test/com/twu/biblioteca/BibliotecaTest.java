package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by dlafeir on 6/16/15.
 */
public class BibliotecaTest {

    List<Book> books;
    PrintStream printStream;
    Biblioteca biblioteca;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        books = new ArrayList<Book>();
    }

    @Test
    public void shouldPrintBookNameWhenBibliotecaHasOneBook(){
        books.add(new Book("Go Dog Go", "Dr Suess", "1990"));
        biblioteca = new Biblioteca(books, printStream);

        biblioteca.printListOfBooks();

        verify(printStream).print("Go Dog Go : Dr Suess : 1990\n");
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooksInBiblioteca(){
        biblioteca = new Biblioteca(books, printStream);

        biblioteca.printListOfBooks();

        verify(printStream).print("");
    }

    @Test
    public void shouldPrintTwoBooksWhenThereAreTwoInBiblioteca(){
        books.add(new Book("Go Dog Go", "Dr Suess", "1990"));
        books.add(new Book("Green Eggs and Ham", "Dr Suess", "1991"));
        biblioteca = new Biblioteca(books, printStream);

        biblioteca.printListOfBooks();

        verify(printStream).print("Go Dog Go : Dr Suess : 1990\nGreen Eggs and Ham : Dr Suess : 1991\n");
    }

    @Test
    public void shouldPrintListBooksMenuOptionWhenCallingListMenu(){
        biblioteca = new Biblioteca(books, printStream);

        biblioteca.displayMenu();

        verify(printStream).println("1) List Books");
    }



}