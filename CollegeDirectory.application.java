package com.collegedirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.collegedirectory.repository")
public class CollegeDirectoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollegeDirectoryApplication.class, args);
    }
}
