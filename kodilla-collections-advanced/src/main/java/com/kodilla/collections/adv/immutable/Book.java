package com.kodilla.collections.adv.immutable;

public class Book {
    protected final String author;
    protected final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public final String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
