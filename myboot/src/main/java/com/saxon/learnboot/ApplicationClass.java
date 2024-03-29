package com.saxon.learnboot;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
 
@RestController
@EnableAutoConfiguration
public class ApplicationClass {
 
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationClass.class, args);
    }
 
}