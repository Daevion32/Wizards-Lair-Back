package com.wizard.lair.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/book/")
public class BookController {
    @GetMapping("")
    public String index(){
        return "Books List";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id){
        return "Book with id: "+id;
    }
}
