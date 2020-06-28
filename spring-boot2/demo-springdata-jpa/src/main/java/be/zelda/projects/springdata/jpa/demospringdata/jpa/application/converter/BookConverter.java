package be.zelda.projects.springdata.jpa.demospringdata.jpa.application.converter;

import be.zelda.projects.springdata.jpa.demospringdata.jpa.domain.Book;
import be.zelda.projects.springdata.jpa.demospringdata.jpa.dto.BookDto;

import java.util.List;
import java.util.stream.Collectors;

public class BookConverter {

    private BookConverter() {}

    public static Book convertToBook(BookDto bookDto) {
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setIsbn(bookDto.getIsbn());
        book.setPrice(bookDto.getPrice());
        return book;
    }

    public static BookDto convertToBookDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setPrice(book.getPrice());
        return bookDto;
    }

    public static List<BookDto> convertToBookDtoList(List<Book>  books) {
        return books.stream().map( BookConverter::convertToBookDto ).collect(Collectors.toList());
    }
}
