package com.cz.item.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;
import com.cz.item.dto.ItemOrderInfo;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/9/15.
 */
public interface OrderMapper extends BaseMapper<Order> {
    List<Order> listOrders(String username);

    ItemOrderInfo getItemOrderInfo(String orderId);
}
