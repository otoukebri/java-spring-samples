package com.example.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Author {
    @Id
    private Long id;

    @Indexed
    private String name;

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
