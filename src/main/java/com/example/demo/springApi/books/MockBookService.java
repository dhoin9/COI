package com.example.demo.springApi.books;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookService implements BookService{
    private List<Book> books;

    public MockBookService() {
        books = new ArrayList<>();
        books.add(new Book( "9788324631766", "Thiniking in Java", "Bruce Eckel"));
        books.add(new Book( "9788324627738", "Rusz glowa Java.", "Sierra Kathy, Bates Bert"));
        books.add(new Book( "9780130819338", "Java 2.Podstawy", "Cay Horstmann, Gary Cornell"));
    }


    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public List<Book> getBooksByTitle(String tittle) {
        return null;
    }

    @Override
    public Book getBookByISBN(String ISBN) {
        return null;
    }
}
