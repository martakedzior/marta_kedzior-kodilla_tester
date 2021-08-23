package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTestSuite {
    BookService bookService = new BookService();
    BookDto bookDto1 = new BookDto("Lalka", "Bolesław Prus");
    BookDto bookDto2 = new BookDto("Ogniem i mieczem", "Henryk Sienkiewicz");
    BookDto bookDto3 = new BookDto("Pan Wołodyjowski", "Henryk Sienkiewicz");

    @Test
    void addBook() {
        //when
        bookService.addBook(bookDto1);
        bookService.addBook(bookDto2);
        bookService.addBook(bookDto3);
        //then
        assertEquals(3, bookService.getBooks().size());

    }

    @Test
    void getBooks() {
        //given
        bookService.addBook(bookDto1);
        bookService.addBook(bookDto2);
        bookService.addBook(bookDto3);
        //when
        bookService.getBooks();
        //then
        for (BookDto book : bookService.getBooks()) {
            System.out.println(book.getAuthor() + ", " + book.getTitle());
        }
        assertEquals(3, bookService.getBooks().size());

    }

    @Test
    void removeBook() {
        //given
        bookService.addBook(bookDto1);
        bookService.addBook(bookDto2);
        bookService.addBook(bookDto3);
        //when
        bookService.removeBook(bookDto1);
        //then
        assertEquals(2, bookService.getBooks().size());
        System.out.println(bookService.getBooks().size());
    }
}