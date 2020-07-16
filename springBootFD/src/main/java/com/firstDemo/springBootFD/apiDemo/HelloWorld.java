package com.firstDemo.springBootFD.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorld {
    @GetMapping("/")
    public String HelloWorldOne(){

        return "Hello World!";
    }
    @GetMapping("/1")
    public String HelloMarstwo(){

        return "Hello Mars!";
    }
}
