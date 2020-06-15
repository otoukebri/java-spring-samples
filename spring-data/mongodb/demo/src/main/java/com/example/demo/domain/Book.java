package com.example.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Book {
    @Id
    private Long id;

    private String title;

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
