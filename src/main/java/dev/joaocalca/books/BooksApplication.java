package dev.joaocalca.books;

import dev.joaocalca.books.models.Author;
import dev.joaocalca.books.models.Book;
import dev.joaocalca.books.repositories.AuthorRepository;
import dev.joaocalca.books.repositories.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
		return args -> {
			Author josh = authorRepository.save(new Author(null, "Josh Long"));
			Author mark = authorRepository.save(new Author(null, "Mark Heckler"));
			bookRepository.saveAll(List.of(
					new Book("Reactive Spring", "self published", josh),
					new Book("Cloud Native Java", "O' Reilly", josh),
					new Book("Spring Boot Up & Running", "O' Reilly", mark)
			));
		};
	}
}
