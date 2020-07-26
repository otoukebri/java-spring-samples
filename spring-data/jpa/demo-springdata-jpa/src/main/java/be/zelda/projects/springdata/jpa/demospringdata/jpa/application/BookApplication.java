package be.zelda.projects.springdata.jpa.demospringdata.jpa.application;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;

import java.util.List;

public interface BookApplication {
    List<Book> getAll();
}
