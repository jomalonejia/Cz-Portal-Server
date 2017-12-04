package com.cz.item.service;

import com.baomidou.mybatisplus.service.IService;
import com.cz.item.domain.Item;

import java.util.List;

/**
 * Created by jomalone_jia
 */
public interface ItemService extends IService<Item> {
    List<Item> listHotItems();

    Item getItemDetail(String itemId);
}
