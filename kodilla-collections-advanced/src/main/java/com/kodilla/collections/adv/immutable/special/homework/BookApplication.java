package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

//        Book book1 = BookManager.createBook("Książka1", "Autor1");
//        Book book2 = BookManager.createBook("Książka2", "Autor2");
//        Book book3 = BookManager.createBook("Książka1", "Autor1");


        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Ksiazka1", "Autor1");
        Book book2 = bookManager.createBook("Ksiazka2", "Autor2");
        Book book3 = bookManager.createBook("Ksiazka1", "Autor1");

        System.out.println(book1 == book2);
        System.out.println(book1 == book3);

        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book2));

        bookManager.getNumberOfBooks();
    }
}
