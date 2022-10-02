package com.wizard.lair.payload.request;


import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@Getter
@Setter
public class BookRequest {

    private Long id;
    private String name;
    private String description;
    private String image;
    private String category;
    private Integer reference;
    private Integer price;



}
