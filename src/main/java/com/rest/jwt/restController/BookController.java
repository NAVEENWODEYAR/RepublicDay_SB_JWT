package com.rest.jwt.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping
    public String test(){
        return "JWT";
    }
}