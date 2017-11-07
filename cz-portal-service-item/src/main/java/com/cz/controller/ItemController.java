package com.cz.controller;

import com.cz.domain.Item;
import com.cz.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jomalone_jia on 2017/10/20.
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    private static final Logger _log = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;

    @GetMapping("/get/{itemId}")
    public Object test(@PathVariable("itemId") String itemId){
        Item itemDetail = itemService.getItemDetail(itemId);
        _log.info(itemDetail.toString());
        return itemDetail;
    }

    @GetMapping("/listHotItems")
    public Object listHotItems(){
        return itemService.listHotItems();
    }

    @PostMapping("/addToCart")
    public Object addToCart(){
        return null;
    }
}
