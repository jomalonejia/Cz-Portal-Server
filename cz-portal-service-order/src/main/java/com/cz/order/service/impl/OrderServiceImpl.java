package com.cz.order.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.order.domain.Order;
import com.cz.order.mapper.OrderMapper;
import com.cz.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created by jomalone_jia
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {

}
