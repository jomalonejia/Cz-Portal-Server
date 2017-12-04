package com.cz.item.controller;

import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;
import com.cz.item.service.CartService;
import com.cz.item.service.OrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("isAuthenticated()")
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
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> get(@PathVariable String username,
                                 @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                 @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize){
        try {
            Page<Order> orders = orderService.listOrders(username, pageNum, pageSize);
            return ResponseEntity.ok(new PageInfo<>(orders));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("list orders failed");
    }

    @GetMapping("/get/{username}/{itemId}")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> getItemOrderInfo(@PathVariable("username") String username,
                                              @PathVariable("itemId") String itemId){
        try {
            _log.info(username);
            _log.info(itemId);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("list orders failed");
    }
}
