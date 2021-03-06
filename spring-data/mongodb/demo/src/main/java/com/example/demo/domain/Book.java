package com.example.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document
public class Book {
    @Id
    private Long id;

    private String title;

    //  private LocalDate publicationDate;
    private LocalDate publicationDate;

    @DBRef
    List<Author> authors;

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
