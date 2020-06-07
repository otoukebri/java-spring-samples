package be.zelda.projects.reactiveapplication.service;

import be.zelda.projects.reactiveapplication.data.Book;
import be.zelda.projects.reactiveapplication.data.BookRepository;
import be.zelda.projects.reactiveapplication.rest.BookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Primary
@Service
@RequiredArgsConstructor
public class BookService implements IBookService {

    private final BookRepository bookRepository;

    public Flux<Book> findAll() {
        return this.bookRepository.findAll();
    }

    public Mono<Book> findOne(Long id) {
        return this.bookRepository.findById(id);
    }

    public Mono<Book> save(BookDto bookDto) {
         return this.bookRepository.save(new Book(bookDto.getTitle(),
                                           bookDto.getIsbn(),
                                           bookDto.getAuthor(),
                                           bookDto.getPrice()));
    }

    public Flux<Book> findByAuthor(String author) {
        return bookRepository.findBooksByAuthorContainingIgnoreCase(author);
    }

    public void delete(Long id) {
        this.bookRepository.deleteById(id).subscribe();
    }
}
