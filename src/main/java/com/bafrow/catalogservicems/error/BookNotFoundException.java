package com.bafrow.catalogservicems.error;

/**
 * @Author BaFr0w
 */
public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
