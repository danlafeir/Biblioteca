package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by dlafeir on 6/16/15.
 */
public class Biblioteca {
    private PrintStream printStream;

    Biblioteca(PrintStream printStream){
        this.printStream = printStream;
        printStream.println("Welcome to Biblioteca!");
    }

}
