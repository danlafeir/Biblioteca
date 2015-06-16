package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by dlafeir on 6/16/15.
 */
public class BibliotecaTest {
    @Test
    public void shouldPrintBookNameWhenBibliotecaHasOneBook(){
        PrintStream printStream = mock(PrintStream.class);
        Biblioteca biblioteca = new Biblioteca(asList(new Book("BookName")), printStream);

        biblioteca.printListOfBooks();
 
        verify(printStream).println("BookName");
    }

}