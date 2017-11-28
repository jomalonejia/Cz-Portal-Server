package com.cz.item.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.common.constants.OrderConstant;
import com.cz.item.core.factory.OrderFactory;
import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;
import com.cz.item.domain.OrderTrack;
import com.cz.item.mapper.CartMapper;
import com.cz.item.mapper.OrderMapper;
import com.cz.item.mapper.OrderTrackMapper;
import com.cz.item.service.OrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    @Autowired
    private OrderTrackMapper orderTrackMapper;

    @Override
    @Transactional
    public void addOrder(List<Cart> carts) {
        carts.forEach(cart -> cartMapper.deleteCart(cart.getId()));
        List<Order> orders = OrderFactory.createOrders(carts);
        orders.forEach(order -> {
            orderMapper.insert(order);
            orderTrackMapper.insert(new OrderTrack(order.getId(), OrderConstant.AWAITING_EXCHANGE_TRACK_INFORMATION));
        });
    }

    @Override
    public Page<Order> listOrders(String username, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Order> orders = orderMapper.listOrders(username);
        return (Page)orders;
    }


}
