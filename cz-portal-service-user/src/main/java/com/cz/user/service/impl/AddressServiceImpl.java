package com.cz.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.user.domain.Address;
import com.cz.user.mapper.AddressMapper;
import com.cz.user.service.AddressService;
import org.springframework.stereotype.Service;

/**
 * Created by jomalone_jia on 2017/11/20.
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper,Address> implements AddressService {
}
