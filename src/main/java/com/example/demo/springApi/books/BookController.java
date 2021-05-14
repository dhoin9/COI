package com.example.demo.springApi.books;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/byTittle/{tittle}")
    public List<Book> getByTitle(@PathVariable String tittle){
    List<Book> listByTittle = new ArrayList<>();
    for (Book book:bookService.getAll())
        if(book.getTitle().contains(tittle)){
            listByTittle.add(book);
        }
        return listByTittle;
    }
    @GetMapping("/byISBN/{ISBN}")
    public List<Book> getByISBN(@PathVariable String ISBN){
        List<Book> listByISBN = new ArrayList<>();
        for (Book book:bookService.getAll())
            if(book.getISBN().contains(ISBN)){
                listByISBN.add(book);
            }
        return listByISBN;
    }

//    @GetMapping("/{id}")
//    public AdviceDTO getOne(@PathVariable long id){
//        return adviceService.getDTO(adviceService.getAdvice(id));
//    }

}
