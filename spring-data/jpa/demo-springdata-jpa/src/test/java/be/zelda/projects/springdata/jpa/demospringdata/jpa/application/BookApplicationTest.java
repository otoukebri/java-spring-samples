package be.zelda.projects.springdata.jpa.demospringdata.jpa.application;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BookApplicationTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookApplicationImpl bookApplication;

    private List<Book> mockBooks;


    @BeforeEach
    public void before() {
        // Arange
        mockBooks = new ArrayList<>();
        Book b = new Book();
        b.setTitle("Java");
        mockBooks.add(b);
    }

    @Test
    public void getAll() {
        // given
        Mockito.when(bookRepository.findAll()).thenReturn(mockBooks);

        // when
        List<Book> books = bookApplication.getAll();

        // then
        assertEquals(mockBooks.size(), mockBooks.size());

    }


}
