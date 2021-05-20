package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public static List<Book> booksList = new ArrayList<>();

    public  static Book createBook(String title, String author){

        Book book = new Book(title, author);

        if (booksList.contains(book)) {
            System.out.println("Taka ksiazka już istnieje.");
        } else {
            booksList.add(book);
            System.out.println("Dodaję ksiązkę " + book.getAuthor() + " " + book.getTitle());
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
