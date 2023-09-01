package dev.joaocalca.books.models;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String publisher;

    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    public Book() {

    }

    public Book(String title, String publisher, Author author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }
}
