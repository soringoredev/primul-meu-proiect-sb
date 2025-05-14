package com.pixelacademy.springdemo_app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/seva")
    public String sevaV() {
        return "Sevastian Vascan!";
    }

    @GetMapping("/dudu")
    public String sanduG() {
        return "Sandu Guzun!";
    }

    @GetMapping("/tanea")
    public String taneaC() {
        return "Tatiana Ceban!";
    }

    @GetMapping("/vera")
    public String veraB() {
        return "Vera Bradu!";
    }


    @GetMapping("/meniu")
    public String meniu() {
        return "Placinte cu brinza!";
    }

}
