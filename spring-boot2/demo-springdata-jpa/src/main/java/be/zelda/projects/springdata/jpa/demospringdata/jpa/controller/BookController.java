package be.zelda.projects.springdata.jpa.demospringdata.jpa.controller;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping
    public ResponseEntity getAllBooks() {
        return ResponseEntity.ok(bookRepository.findAll());
    }
}
