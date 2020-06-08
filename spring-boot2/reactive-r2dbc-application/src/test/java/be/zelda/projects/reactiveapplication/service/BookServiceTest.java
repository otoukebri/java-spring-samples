package be.zelda.projects.reactiveapplication.service;


import be.zelda.projects.reactiveapplication.data.Book;
import be.zelda.projects.reactiveapplication.data.BookRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.math.BigDecimal;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    BookRepository bookRepository;

    @InjectMocks
    BookService bookService;

    @Test
    public void finAllTest() {
        // given
        Flux<Book> booksFluxMock = Flux.just(
                new Book("JAVA11", "IBSN1", "toto1", new BigDecimal(10)),
                new Book("DDD", "IBSN2", "toto2", new BigDecimal(15))

        );

        Mockito.when(this.bookRepository.findAll()).thenReturn(booksFluxMock);

        // when
        Flux<Book> books =  this.bookService.findAll();

        // then
        StepVerifier.create(books)
//                .expectNextMatches(p -> p.getTitle().equalsIgnoreCase("JAVA11"));
                .expectNextCount(2) //
                .verifyComplete();

    }
}
