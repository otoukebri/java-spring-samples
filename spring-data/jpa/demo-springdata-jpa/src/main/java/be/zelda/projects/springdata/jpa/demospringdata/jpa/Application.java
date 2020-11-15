package be.zelda.projects.springdata.jpa.demospringdata.jpa;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Author;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.repository.AuthorRepository;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

//HTTP client

@EnableJpaRepositories
@SpringBootApplication
public class Application {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init() {
        Book b = new Book();
        b.setTitle("Java");
        b.setIsbn("AAAA");

        Author a = new Author();
        a.setName("J.Blosh");
        bookRepository.save(b);
//        authorRepository.save(a);

    }

}


