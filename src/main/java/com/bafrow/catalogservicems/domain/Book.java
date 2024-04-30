package com.bafrow.catalogservicems.domain;

/**
 * @Author BaFr0w
 */
public record Book(
        String isbn,
        String title,
        String author,
        Double price
) {
}
