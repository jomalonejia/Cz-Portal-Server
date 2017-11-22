package com.cz.item.controller;

import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;
import com.cz.item.service.CartService;
import com.cz.item.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<?> add(@RequestBody List<Cart> carts){
        try {
            orderService.addOrder(carts);
            return ResponseEntity.ok("add order success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("add order failed");
    }

    @GetMapping("/get/{username}")
    public ResponseEntity<?> get(@PathVariable String username){
        try {
            List<Order> orders = orderService.listOrders(username);
            return ResponseEntity.ok(orders);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("list orders failed");
    }
}
