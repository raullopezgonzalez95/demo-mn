package com.example;

import io.micronaut.runtime.Micronaut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        log.info("Hola mundo");
        Micronaut.run(Application.class, args);
    }
}