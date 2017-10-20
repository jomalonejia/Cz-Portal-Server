package com.cz;

import com.cz.domain.Item;
import com.cz.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class ApplicationTests {


    @Autowired
    private ItemService orderService;

    @Test
    public void contextLoads() {
        Item order = orderService.selectById("1");
        System.out.println(order.toString());
    }

}