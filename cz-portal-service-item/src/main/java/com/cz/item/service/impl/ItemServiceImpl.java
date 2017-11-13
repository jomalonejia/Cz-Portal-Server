package com.cz.item.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.item.domain.Item;
import com.cz.item.mapper.ItemMapper;
import com.cz.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jomalone_jia
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper,Item> implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> listHotItems() {
        return itemMapper.listHotItems();
    }

    @Override
    public Item getItemDetail(String itemId) {
        return itemMapper.getItemDetail(itemId);
    }
}
