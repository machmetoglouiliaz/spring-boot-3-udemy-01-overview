package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${info.app.author.name}")
    private String authorName;

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose "/author" that return the name of author located in src.main.resources.application.properties
    @GetMapping("/author")
    public String getAuthorName() {
        return authorName;
    }

    // expose "/workout" that return a daily workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    // expose "/fortune" that tell you the future :O
    @GetMapping("/fortune")
    public String getFortune(){
        return "Your lucky day!";
    }
}
