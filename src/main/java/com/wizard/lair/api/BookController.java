package com.wizard.lair.api;


import com.wizard.lair.model.Book;
import com.wizard.lair.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    private final BookRepository bookRepository;
    @Autowired
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @GetMapping("")
    public List<Book> index(){
        List<Book> bookList = bookRepository.findAll();
        return bookList;
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id){
        return bookRepository.findById(id).get();
    }


}
