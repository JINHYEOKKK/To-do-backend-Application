package com.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devApplication {

    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello, World!");
    }
}