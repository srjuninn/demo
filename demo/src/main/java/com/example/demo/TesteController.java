package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
public class TesteController {
    @GetMapping("get")
    ResponseEntity<?> github(){
        return ResponseEntity.ok("CI/CD no github paizão, nobody yes door soon, give your jumps");
    }
}
