package be.zelda.projects.springdata.jpa.demospringdata.jpa.repository;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class BookRepositoryTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findByTitleTest() {
        // given
        Book book = new Book();
        book.setTitle("Java 14");
        this.entityManager.persist(book);

        // when
        List<Book> bookDb = this.bookRepository.findByTitleContains("Java");

        // then
        assertNotNull(bookDb.get(0));
        assertTrue(book.getTitle().contains(bookDb.get(0).getTitle()));
    }
}
