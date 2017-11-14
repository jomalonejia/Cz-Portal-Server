package com.cz.item.service;

import com.baomidou.mybatisplus.service.IService;
import com.cz.item.domain.Cart;

/**
 * Created by jomalone_jia on 2017/11/14.
 */
public interface CartService extends IService<Cart> {
    void insertCart(Cart cart);
}
