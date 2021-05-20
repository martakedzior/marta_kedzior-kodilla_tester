package com.kodilla.collections.adv.immutable;

public class Book {
    private final String author;
    private final String title;

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
