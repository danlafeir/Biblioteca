package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by dlafeir on 6/17/15.
 */
public class BookTest {

    @Test
    public void shouldFormatBookInfomationWhenGettingDetails(){
        Book book = new Book("Go Dog Go", "Dr. Suess", "1990");

        String booksToPrint = book.getBookDetails();

        assertThat(booksToPrint, is("Go Dog Go : Dr. Suess : 1990"));
    }
}