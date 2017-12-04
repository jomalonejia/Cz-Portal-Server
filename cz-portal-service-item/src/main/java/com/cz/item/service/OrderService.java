package com.cz.item.service;

import com.baomidou.mybatisplus.service.IService;
import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;
import com.cz.item.dto.ItemOrderInfo;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by jomalone_jia 2017/11/21
 */
public interface OrderService extends IService<Order> {
    void addOrder(List<Cart> carts);

    Page<Order> listOrders(String username, int pageNum, int pageSize);

    ItemOrderInfo getItemOrderInfo(String orderId);
}
