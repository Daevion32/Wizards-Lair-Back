package com.wizard.lair.service;

import com.wizard.lair.model.Book;
import com.wizard.lair.payload.request.BookRequest;
import com.wizard.lair.repository.BookRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Builder
public class BookService {
    private final BookRepository bookRepository;


    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public List<Book>findAll(){
        return bookRepository.findAll();
    }

    public Book findByID(Long id){
        return bookRepository.findById(id).get();
    }

    public Long delete(Long id) {
        if (bookRepository.findById(id).isEmpty()) {
            throw new RuntimeException("Book not Found");
        }
        bookRepository.deleteById(id);
        return id;
    }
    public Book update(Book book){
        if (bookRepository.findById(book.getId()).isEmpty()) {
            throw new RuntimeException("Book not Found");
        }
        return bookRepository.save(book);

    }
    public Book  create(BookRequest bookRequest){
        Book book = Book
                .builder()
                .name(bookRequest.getName())
                .image(bookRequest.getImage())
                .description(bookRequest.getDescription())
                .category(bookRequest.getCategory())
                .build();
        return bookRepository.save(book);
    }
}
