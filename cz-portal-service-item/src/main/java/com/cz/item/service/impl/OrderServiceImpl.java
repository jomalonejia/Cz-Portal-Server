package com.cz.item.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;
import com.cz.item.mapper.CartMapper;
import com.cz.item.mapper.OrderMapper;
import com.cz.item.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jomalone_jia
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {

    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    public void addOrder(List<Cart> carts) {
        carts.forEach(cart -> cartMapper.deleteCart(cart.getId()));
    }
}
