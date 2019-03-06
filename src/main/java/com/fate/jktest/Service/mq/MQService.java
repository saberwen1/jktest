package com.fate.jktest.Service.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @Author: fate
 * @Date: 2019/3/6 11:42
 * @Version 1.0
 */
@Service
public class MQService {

    @RabbitListener(queues = "fate")
    public void receiver(String msg) {
        System.out.println(msg);
    }
}
