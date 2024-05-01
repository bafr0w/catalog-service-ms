package com.bafrow.catalogservicems;

import com.bafrow.catalogservicems.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import static org.assertj.core.api.Assertions.*;


@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class CatalogServiceMsApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void contextLoads() {
    }

    @Test
    void whenPostRequestThenBookCreated() {
        var expectedBook = new Book("1231231231", "Title", "Author", 9.90);
        webTestClient
                .post() // sends POST request
                .uri("api/v1/books") // sends request to /books endpoint
                .bodyValue(expectedBook) // add book in the request body
                .exchange() //sends the request
                .expectStatus().isCreated() //verifies that the HTTP response is "201 Created"
                .expectBody(Book.class).value(actualBook -> {
                    assertThat(actualBook).isNotNull(); // verifies that the response has a non-null body.
                    assertThat(actualBook.isbn()).isEqualTo(expectedBook.isbn()); //verifies that the created object is as expected.
                });
    }

}
