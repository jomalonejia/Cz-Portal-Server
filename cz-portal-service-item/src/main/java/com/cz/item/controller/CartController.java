package com.cz.item.controller;

import com.cz.item.domain.Cart;
import com.cz.item.service.CartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jomalone_jia on 2017/11/14.
 */
@RestController
@RequestMapping("/cart")
public class CartController {

    private static final Logger _log = LoggerFactory.getLogger(CartController.class);

    @Autowired
    private CartService cartService;

    @PostMapping("/addToCart")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> addToCart(@RequestBody Cart cart){
        try {
            cartService.insertCart(cart);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/get/{username}")
    @PreAuthorize("isAuthenticated()")
    public Object getCartByUsername(@PathVariable String username){
        try {
            return cartService.getCartByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/delete/{cartId}")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> deleteCartById(@PathVariable String cartId){
        try {
            _log.info("++++++++++++++++++++++++++"+cartId);
            cartService.deleteCart(cartId);
            return ResponseEntity.ok(cartId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }

}
