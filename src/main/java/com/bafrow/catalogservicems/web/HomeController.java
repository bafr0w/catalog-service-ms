package com.bafrow.catalogservicems.web;

import com.bafrow.catalogservicems.config.ApplicationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author BaFr0w
 */
@RestController
public class HomeController {

    private final ApplicationProperties applicationProperties;

    public HomeController(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        return applicationProperties.getGreeting();
    }
}
