package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    private Biblioteca biblioteca;
    private BibliotecaApp bibliotecaApp;

    @Before
    public void setUp() {
        biblioteca = mock(Biblioteca.class);
        bibliotecaApp = new BibliotecaApp(biblioteca);
    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void shouldDisplayWelcomeMessageOnRun(){
        bibliotecaApp.run();
        verify(biblioteca).printWelcomeMessage();
    }

    @Test
    public void shouldDisplayMenuOptionsOnRun(){
        bibliotecaApp.run();
        verify(biblioteca).displayMenu();
    }
}
