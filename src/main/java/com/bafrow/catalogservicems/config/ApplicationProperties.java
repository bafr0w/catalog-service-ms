package com.bafrow.catalogservicems.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author BaFr0w
 */
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {

    /**
     * A message to welcome users.
     */
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
