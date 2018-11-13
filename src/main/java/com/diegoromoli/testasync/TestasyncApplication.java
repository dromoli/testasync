package com.diegoromoli.testasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TestasyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestasyncApplication.class, args);
    }
}
