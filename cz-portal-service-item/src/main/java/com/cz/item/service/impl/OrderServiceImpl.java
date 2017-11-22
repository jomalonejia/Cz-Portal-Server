package com.cz.item.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.item.core.factory.OrderFactory;
import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;
import com.cz.item.mapper.CartMapper;
import com.cz.item.mapper.OrderMapper;
import com.cz.item.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jomalone_jia
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {
    private static final Logger _log = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    public void addOrder(List<Cart> carts) {
        carts.forEach(cart -> cartMapper.deleteCart(cart.getId()));
        List<Order> orders = OrderFactory.createOrders(carts);
        orders.forEach(order -> orderMapper.insert(order));
    }

    @Override
    public List<Order> listOrders(String username) {
        return orderMapper.selectList(new EntityWrapper<Order>().eq("username",username));
    }
}
