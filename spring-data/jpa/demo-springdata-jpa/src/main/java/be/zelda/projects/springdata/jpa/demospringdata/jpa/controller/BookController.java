package be.zelda.projects.springdata.jpa.demospringdata.jpa.controller;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.application.BookApplication;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.application.converter.BookConverter;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    private BookApplication bookApplication;

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return ResponseEntity.ok(BookConverter.convertToBookDtoList(bookApplication.getAll()));
    }
}
