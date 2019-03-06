package com.fate.jktest.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: fate
 * @Date: 2019/3/6 11:22
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqTest {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    public void amqp() {
        Exchange exchange = new DirectExchange("new_derict");
        amqpAdmin.declareExchange(exchange);
        Queue queue = new Queue("new",true);
        amqpAdmin.declareQueue(queue);
        amqpAdmin.declareBinding(
                new Binding("new", Binding.DestinationType.QUEUE,"new_derict","new_key",null));
    }

    @Test
    public void rmq() {
        rabbitTemplate.convertAndSend("my.topic","fate","你好，世界");
    }

    @Test
    public void receive() {
        Object fate = rabbitTemplate.receiveAndConvert("fate");
        System.out.println(fate);
    }
}
