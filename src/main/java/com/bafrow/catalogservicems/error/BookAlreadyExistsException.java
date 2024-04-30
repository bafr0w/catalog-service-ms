package com.bafrow.catalogservicems.error;

/**
 * @Author BaFr0w
 */
public class BookAlreadyExistsException extends RuntimeException{
    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
