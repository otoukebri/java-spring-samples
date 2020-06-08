package be.zelda.projects.reactiveapplication.rest;

import be.zelda.projects.reactiveapplication.data.Book;
import be.zelda.projects.reactiveapplication.service.BookService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;
import java.util.Arrays;

//@WithMockUser
@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = BookRestController.class)
@Import(BookService.class)
public class BookRestControllerTest {

    @MockBean
    BookService bookService;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private WebTestClient webTestClient;

    @Before
    public void beforeAll() {
        MockitoAnnotations.initMocks(this);
        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .map(name -> applicationContext.getBean(name).getClass().getName() + "xxxxxxxxxxxx")
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    public void getAllTest() {
        // given
        Flux<Book> booksFluxMock = Flux.just(
                new Book("JAVA11", "IBSN1", "toto1", new BigDecimal(10)),
                new Book("DDD", "IBSN2", "toto2", new BigDecimal(15))

        );

        Mockito.when(this.bookService.findAll()).thenReturn(booksFluxMock);


        this.webTestClient
                .get()
                .uri("/books")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.[0].title").isEqualTo("JAVA11");


    }
}
