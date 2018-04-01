package xyz.devplay.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping(value="/")
    public String home() {
        return "Hello Spring Boot";
    }

}
