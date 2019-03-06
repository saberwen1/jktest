package com.fate.jktest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.fate.jktest.mapper")
/**
 * rabbitmq:
 * rabbitTemplate:发&接消息
 * AmqpAdmin:系统管理功能组件，创建删除queue,binding,exchange
 */
@EnableRabbit
public class JktestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JktestApplication.class, args);
    }

}

