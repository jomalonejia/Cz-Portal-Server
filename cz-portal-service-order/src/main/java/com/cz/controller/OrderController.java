package com.cz.controller;

import com.cz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jomalone_jia on 2017/9/18.
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/test")
    public String test(){
        return orderService.selectById("1").toString();
    }
}
