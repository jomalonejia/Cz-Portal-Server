package com.cz.item.service;

import com.baomidou.mybatisplus.service.IService;
import com.cz.item.domain.Cart;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/11/14.
 */
public interface CartService extends IService<Cart> {
    void insertCart(Cart cart);

    List<Cart> getCartByUsername(String username);

    int deleteCart(String cartId);

    void deleteCartAll(List<String> cartIds);
}
