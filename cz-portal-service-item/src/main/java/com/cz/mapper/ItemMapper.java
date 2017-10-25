package com.cz.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cz.domain.Item;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/9/15.
 */
public interface ItemMapper extends BaseMapper<Item> {
    List<Item> listHotItems();
}
