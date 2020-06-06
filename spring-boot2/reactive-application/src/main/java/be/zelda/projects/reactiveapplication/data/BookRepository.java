package be.zelda.projects.reactiveapplication.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
    Flux<Book> findBooksByAuthorContainingIgnoreCase(String author);
}
