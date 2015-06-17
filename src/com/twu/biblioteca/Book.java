package com.twu.biblioteca;

import com.sun.deploy.util.StringUtils;

/**
 * Created by dlafeir on 6/16/15.
 */
public class Book {
    private String bookName;
    private String author;
    private String year;

    public Book(String bookName, String author, String year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }

    public String getBookDetails() {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.insert(0,bookName);
        stringbuilder.insert(20, author);
        stringbuilder.insert(40, year);
        return stringbuilder.toString();
    }
}
