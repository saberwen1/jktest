package com.fate.jktest;

import com.fate.jktest.Service.FinanceService;
import com.fate.jktest.bean.Fund;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: fate
 * @Date: 2019/3/5 23:17
 * @Version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTest {
    @Autowired
    RedisTemplate redisEntityTemplate;
    @Autowired
    FinanceService financeService;
    @Test
    public void test() {
        Fund fund = financeService.queryByPId(1);
        redisEntityTemplate.opsForValue().set("hello",fund);
    }
}
