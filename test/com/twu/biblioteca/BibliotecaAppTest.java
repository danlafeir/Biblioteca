package com.twu.biblioteca;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void shouldDisplayWelcomeMessage(){
        PrintStream printStream = mock(PrintStream.class);
        List<Book> books = new ArrayList<Book>();
        new Biblioteca(books, printStream);
        verify(printStream).println("Welcome to the Biblioteca!");
    }
}
