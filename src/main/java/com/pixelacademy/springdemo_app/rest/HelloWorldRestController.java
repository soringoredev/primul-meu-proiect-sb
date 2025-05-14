package com.pixelacademy.springdemo_app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/vera")
    public String veraB() {
        return "Vera bradu!";
    }

}
