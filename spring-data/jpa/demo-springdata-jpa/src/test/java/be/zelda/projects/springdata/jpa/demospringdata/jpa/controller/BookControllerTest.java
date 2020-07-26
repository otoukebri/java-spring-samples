package be.zelda.projects.springdata.jpa.demospringdata.jpa.controller;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.application.BookApplicationImpl;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.dto.BookDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BookControllerTest {

    @InjectMocks
    BookController bookController;

    @Mock
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
    public void getAllBooks() throws Exception {
        // given
        when(this.bookApplication.getAll()).thenReturn(mockBooks);

        // when
        List<BookDto> controllerBooks = (List<BookDto>) bookController.getAllBooks().getBody();

        // then
        assertEquals(mockBooks.size(), controllerBooks.size());


    }


}
