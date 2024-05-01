package com.bafrow.catalogservicems.web;

import com.bafrow.catalogservicems.error.BookNotFoundException;
import com.bafrow.catalogservicems.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author BaFr0w
 */
@WebMvcTest(BookController.class) // Identifies a test class that focuses on Spring MVC components specifically the BookController class.
class BookControllerMvcTests {

    @Autowired
    private MockMvc mockMvc;  //utility class to test the web layer (endpoints) in a mock environment.

    @MockBean                      // Adds a mock of BookService to the Spring application context.
    private BookService bookService;

    @Test
    void whenGetBookNotExistingThenShouldReturn404() throws Exception {
        String isbn = "73737313940";
        given(bookService.viewBookDetails(isbn))
                .willThrow(BookNotFoundException.class);
        mockMvc
                .perform(get("/api/v1/books/" + isbn))
                .andExpect(status().isNotFound());
    }

}
