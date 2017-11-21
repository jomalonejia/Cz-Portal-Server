package com.cz.item.controller;

import com.cz.item.domain.Cart;
import com.cz.item.service.CartService;
import com.cz.item.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/11/21.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private static final Logger _log = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private CartService cartService;
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public Object add(List<Cart> carts){
        orderService.addOrder(carts);
        return "success";
    }
}
