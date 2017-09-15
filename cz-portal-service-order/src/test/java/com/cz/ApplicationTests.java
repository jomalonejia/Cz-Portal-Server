package com.cz;

import com.cz.service.IOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class ApplicationTests {

    @Autowired
    private IOrderService orderService;

    @Test
    public void test1(){

        System.out.println(orderService.selectById(1L));
    }

}