package com.cz.order.controller;

import com.cz.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jomalone_jia on 2017/9/18.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/test")
    public String test(){
        return "hehe";
    }

}
