package com.bafrow.catalogservicems.persistence;

import com.bafrow.catalogservicems.domain.Book;

import java.util.Optional;

/**
 * @Author BaFr0w
 */
public interface BookRepository {
    Iterable<Book> findAll();
    Optional<Book> findByIsbn(String isbn);
    boolean existsByIsbn(String isbn);
    Book save(Book book);
    void deleteByIsbn(String isbn);
}
