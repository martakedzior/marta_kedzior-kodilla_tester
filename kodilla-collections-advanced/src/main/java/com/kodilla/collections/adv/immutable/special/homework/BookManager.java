package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<Book> booksList = new ArrayList<>();

    public  Book createBook(String title, String author){

        Book book = new Book(title, author);

        booksList.add(book);
        System.out.println("Book added: " + booksList );

        if (booksList.contains(book)) {
            System.out.println("Taka ksiazka już istnieje.");
        }else{
            booksList.add(book);
            System.out.println("Dodaję ksiązkę" + book.getAuthor());
        }

//        for(Book item : booksList){
//            if (item.equals(book)){
//                System.out.println("Taka ksiazka już istnieje.");
//            }else {
//                booksList.add(book);
//                System.out.println("Dodaję ksiązkę" + book.getAuthor());
//            }
//        }
        return book;
    }

    public void getNumberOfBooks() {
        System.out.println(booksList.size());
    }

}
