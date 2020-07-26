package be.zelda.projects.springdata.jpa.demospringdata.jpa.application;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookApplicationImpl implements BookApplication {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return (List<Book>) this.bookRepository.findAll();
    }
}
