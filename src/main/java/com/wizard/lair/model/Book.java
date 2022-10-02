package com.wizard.lair.model;


import lombok.*;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    private String category;
    private Integer reference;
    private Integer price;
    private boolean buyable;
    private boolean favorite;


}
