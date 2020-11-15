package be.zelda.projects.springdata.jpa.demospringdata.jpa.repository;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
