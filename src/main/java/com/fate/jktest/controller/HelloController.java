package com.fate.jktest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "welcome to this page.";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
