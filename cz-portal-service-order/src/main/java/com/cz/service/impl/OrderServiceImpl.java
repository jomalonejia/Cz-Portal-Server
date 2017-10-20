package com.cz.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.domain.Order;
import com.cz.domain.SysUser;
import com.cz.mapper.OrderMapper;
import com.cz.mapper.SysUserMapper;
import com.cz.service.OrderService;
import com.cz.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * Created by oukingtim
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {

}
