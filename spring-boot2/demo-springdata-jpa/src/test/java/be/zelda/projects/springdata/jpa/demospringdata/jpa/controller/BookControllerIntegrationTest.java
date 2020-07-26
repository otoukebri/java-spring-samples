package be.zelda.projects.springdata.jpa.demospringdata.jpa.controller;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.application.BookApplicationImpl;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookApplicationImpl bookApplication;

    private List <Book> mockBooks;

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
        // arrange
        when(this.bookRepository.findAll()).thenReturn(mockBooks);

        // Act
        // Asset
        this.mockMvc.perform(get("/api/v1/books"))
                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.length()", hasSize(mockBooks.size())))
        ;

    }

}
