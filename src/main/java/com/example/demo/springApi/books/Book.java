package com.example.demo.springApi.books;

public class Book {
    private String title;
    private String ISBN;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }
}
