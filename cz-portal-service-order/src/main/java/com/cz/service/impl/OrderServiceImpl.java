package com.cz.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.domain.Order;
import com.cz.mapper.OrderMapper;
import com.cz.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * Created by jomalone_jia on 2017/9/15.
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements IOrderService{
}
