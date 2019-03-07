package com.fate.jktest.es;

import com.fate.jktest.Service.FinanceService;
import com.fate.jktest.bean.Fund;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @Author: fate
 * @Date: 2019/3/6 15:59
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ESTest {

    @Autowired
    FinanceService financeService;
    @Autowired
    JestClient jestClient;

    @Test
    public void test() {
        Fund fund = financeService.queryByPId(1);
        Index build = new Index.Builder(fund).index("fund").type("wine").build();
        try {
            jestClient.execute(build);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
