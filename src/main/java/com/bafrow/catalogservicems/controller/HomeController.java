package com.bafrow.catalogservicems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author BaFr0w
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String getGreeting() {
        return "Welcome to the Gye Nyame Book Catalog.";
    }
}
