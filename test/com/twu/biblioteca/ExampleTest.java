package com.twu.biblioteca;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void shouldDisplayWelcomeMessage(){
        PrintStream printStream = mock(PrintStream.class);
        new Biblioteca(printStream);
        verify(printStream).println("Welcome to the Biblioteca");
    }
}
