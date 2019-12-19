package com.saxon.openfeigndemo;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;
 
@SpringBootApplication
@EnableFeignClients
public class ApplicationClass {
 
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationClass.class, args);
    }
 
}