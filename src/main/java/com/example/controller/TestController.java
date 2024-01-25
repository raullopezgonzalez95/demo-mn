package com.example.controller;

import com.example.service.TestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class TestController {
    private final TestService testService;

    @GetMapping(value = "hello-world")
    public String helloWorld() {
        return testService.helloWorld();
    }
}
