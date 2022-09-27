package com.wizard.lair.api;


import com.wizard.lair.model.Book;
import com.wizard.lair.payload.request.BookRequest;
import com.wizard.lair.repository.BookRepository;
import com.wizard.lair.service.BookService;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Builder
@RequestMapping("/api/v1/book")
public class BookController {

    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("")
    public ResponseEntity<List<Book>> index(){
        return ResponseEntity.ok().body(bookService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Long id){

        return ResponseEntity.ok().body(bookService.findByID(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id){

        return ResponseEntity.ok().body(bookService.delete(id));
    }
    @PostMapping("/createBook")
    public ResponseEntity<?> create(@RequestBody BookRequest bookRequest){

        return ResponseEntity.ok().body(bookService.create(bookRequest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@RequestBody Book book) {

        return ResponseEntity.ok().body(bookService.update(book));
    }
}
