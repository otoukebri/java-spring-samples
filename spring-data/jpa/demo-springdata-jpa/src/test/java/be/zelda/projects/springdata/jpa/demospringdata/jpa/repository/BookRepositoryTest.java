package be.zelda.projects.springdata.jpa.demospringdata.jpa.repository;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("/db/migration/V1_data.sql")
class BookRepositoryTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findByTitleTest() {
        // given
        Book book = new Book();
        book.setTitle("C++");
        this.entityManager.persist(book);

        // when
        List<Book> bookDb = this.bookRepository.findByTitleContainsIgnoreCase("C++");

        // then
        assertEquals(bookDb.size(), 2);
        assertNotNull(bookDb.get(0));
        assertTrue(book.getTitle().equals(bookDb.get(0).getTitle()));
    }
}
