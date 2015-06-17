package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    private Biblioteca biblioteca;
    private BibliotecaApp bibliotecaApp;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() {
        bufferedReader = mock(BufferedReader.class);
        biblioteca = mock(Biblioteca.class);
        bibliotecaApp = new BibliotecaApp(biblioteca, bufferedReader);
        bibliotecaApp.run();
    }

    @Test
    public void shouldDisplayWelcomeMessageOnRun(){
        verify(biblioteca).printWelcomeMessage();
    }

    @Test
    public void shouldDisplayMenuOptionsOnRun(){
        verify(biblioteca).displayMenu();
    }

    @Test
    public void shouldPrintListOfBooksWhenGetUserInput() {
        int userInput = bibliotecaApp.getUserInput();

        assertThat(userInput, is(1));
    }

    @Test
    public void shouldCallScannerWhenGettingUserinput(){
        int userInput = bibliotecaApp.getUserInput();

        try {
            verify(bufferedReader).readLine();
        }
        catch (IOException e){}
    }

}
