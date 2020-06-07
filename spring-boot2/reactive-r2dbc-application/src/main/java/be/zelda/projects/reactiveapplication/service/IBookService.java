package be.zelda.projects.reactiveapplication.service;

import be.zelda.projects.reactiveapplication.data.Book;
import be.zelda.projects.reactiveapplication.rest.BookDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IBookService {
    Flux<Book> findAll();
    Mono<Book> findOne(Long id);
    Mono<Book> save(BookDto bookDto);
    Flux<Book> findByAuthor(String author);
    void delete(Long id);
}