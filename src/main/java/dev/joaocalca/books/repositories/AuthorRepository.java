package dev.joaocalca.books.repositories;

import dev.joaocalca.books.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
