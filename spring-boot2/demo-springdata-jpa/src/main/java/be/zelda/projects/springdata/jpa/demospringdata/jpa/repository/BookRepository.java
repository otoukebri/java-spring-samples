package be.zelda.projects.springdata.jpa.demospringdata.jpa.repository;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long > {

}
