package com.cz.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.domain.Item;
import com.cz.mapper.ItemMapper;
import com.cz.service.ItemService;
import org.springframework.stereotype.Service;

/**
 * Created by oukingtim
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper,Item> implements ItemService {

}
