package com.cz.controller;

import com.cz.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jomalone_jia on 2017/10/20.
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/test")
    public Object test(){
        return "test item";
    }

    @GetMapping("/listHotItems")
    public Object listHotItems(){

        return null;
    }
}
