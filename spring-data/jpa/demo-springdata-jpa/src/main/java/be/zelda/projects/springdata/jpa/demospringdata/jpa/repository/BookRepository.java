package be.zelda.projects.springdata.jpa.demospringdata.jpa.repository;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByTitleContainsIgnoreCase(String titre);

    // use @Query with long method name or complex queries
    @Query("SELECT b from Book b  WHERE b.title = : title AND b.price = : price ")
    List<Book>  findByTitleAndPrice(@Param("title") String titre, @Param("price") Double prix);


}
