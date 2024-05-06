package com.bafrow.catalogservicems.demo;

import com.bafrow.catalogservicems.domain.Book;
import com.bafrow.catalogservicems.persistence.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author BaFr0w
 */
@Component
@Profile("testdata")
public class BookDataLoader {
    private final BookRepository bookRepository;

    public BookDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        bookRepository.deleteAll();
        var book1 = Book.of("1234567891", "Northern Lights", "Lyra Silverstar", 9.90);
        var book2 = Book.of("1234567892", "Polar Journey", "Iorek Polarson", 12.90);
        var book3 = Book.of("1234567893", "The gods are not to blame", "Chinua Achebe", 14.90);
        bookRepository.saveAll(List.of(book1, book2, book3));
    }
}
