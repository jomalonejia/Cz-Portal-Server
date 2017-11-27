package com.cz.item.service;

import com.baomidou.mybatisplus.service.IService;
import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by jomalone_jia 2017/11/21
 */
public interface OrderService extends IService<Order> {
    void addOrder(List<Cart> carts);
    PageInfo<Order> listOrders(String username,int pageNum,int pageSize);
}
