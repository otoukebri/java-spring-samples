package be.zelda.projects.reactiveapplication.rest;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BookDto {
    private String title;
    private String isbn;
    private String author;
    private BigDecimal price;
}
