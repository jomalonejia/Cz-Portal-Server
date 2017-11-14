package com.cz.item.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.item.controller.CartController;
import com.cz.item.domain.Cart;
import com.cz.item.domain.CartParam;
import com.cz.item.mapper.CartMapper;
import com.cz.item.service.CartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jomalone_jia on 2017/11/14.
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper,Cart> implements CartService{

    private static final Logger _log = LoggerFactory.getLogger(CartServiceImpl.class);

    @Autowired
    private CartMapper cartMapper;

    @Transactional
    public void insertCart(Cart cart){
        for (CartParam cartParam : cart.getParams()) {
            cartMapper.insert(new Cart(cart.getUsername(),cart.getCount(),cart.getItemId(),cartParam.getParamId(),cartParam.getParamValue()));
        }
    }
}
