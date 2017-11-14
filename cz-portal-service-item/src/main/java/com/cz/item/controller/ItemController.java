package com.cz.item.controller;

import com.cz.item.domain.Cart;
import com.cz.item.domain.Item;
import com.cz.item.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @GetMapping("/test")
    @PreAuthorize("isAuthenticated()")
    public Object test(){
        return "test";
    }


}
