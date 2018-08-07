package com.sparrow.oms.web.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Project: pirate-ship
 * @Author: Jack
 * @CreateTime: 2018/8/7 17:12
 * @Describe:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void test1() {
        orderService.selectList(null).forEach(e -> {
            log.info("{}", e);
        });
    }
}
