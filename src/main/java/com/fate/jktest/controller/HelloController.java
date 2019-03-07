package com.fate.jktest.controller;

import com.fate.jktest.Service.FinanceService;
import com.fate.jktest.bean.Fund;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class HelloController {

    @Autowired
    FinanceService financeService;

    @RequestMapping("/")
    public String index() {
        System.out.println("hello");
        log.info("hello,this is a log");
        return "welcome to this page.";
    }

    @GetMapping("/finance/{id}")
    public Fund finance(@PathVariable Integer id) {
        return financeService.queryByPId(id);
    }
}

