package com.ibm.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/helloEarth")
    public String helloEarth() {
        return "Hello Earth!";
    }
    @GetMapping("/helloMars")
    public String helloMars() {
        return "Hello Mars!";
    }
}