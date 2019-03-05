package com.fate.jktest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.fate.jktest.mapper")
public class JktestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JktestApplication.class, args);
    }

}

