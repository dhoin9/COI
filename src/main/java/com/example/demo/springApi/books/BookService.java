package com.example.demo.springApi.books;

import java.util.List;

public interface BookService {

    List<Book> getAll();
    List<Book> getBooksByTitle(String tittle);
    Book getBookByISBN(String ISBN);

}

