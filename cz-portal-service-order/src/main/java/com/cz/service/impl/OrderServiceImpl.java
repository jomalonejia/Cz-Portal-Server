package com.cz.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.domain.Order;
import com.cz.mapper.OrderMapper;
import com.cz.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created by jomalone_jia
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {

}
