package com.example.weatherBE.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${FETCH_URL_DAY}")
    private String wp;


    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/greetings")
    @ResponseBody
    public String greeting() {return  "Greetings " ;};

    @GetMapping("/name")
    @ResponseBody
    public String greetingsWithNameByQuery(@RequestParam(required = false) String name) {
        if(name != null) {
            return "Greetings " + name + wp;
        }
        return "Greetings";

    };

}

