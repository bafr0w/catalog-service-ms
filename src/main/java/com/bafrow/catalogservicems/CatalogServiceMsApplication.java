package com.bafrow.catalogservicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CatalogServiceMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceMsApplication.class, args);
    }

}
