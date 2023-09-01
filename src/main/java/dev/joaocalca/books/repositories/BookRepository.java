package dev.joaocalca.books.repositories;

import dev.joaocalca.books.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
