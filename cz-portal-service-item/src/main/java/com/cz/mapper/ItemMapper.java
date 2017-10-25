package com.cz.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cz.domain.Item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/9/15.
 */
public interface ItemMapper extends BaseMapper<Item> {
    List<Item> listHotItems();
    Item getItemDetail(@Param("itemId") String itemId);
}
