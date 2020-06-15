package com.example.demo;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	private void createBooks() {
		bookRepository.deleteAll();
		System.out.println("DemoApplication.createBooks");
		Book book1 =  new Book(1L, "Java 11");
		this.bookRepository.save(book1);

		System.out.println("DemoApplication.createBooks");
		Book book2 =  new Book(2L, "Kafka");
		this.bookRepository.save(book2);
	}
}
