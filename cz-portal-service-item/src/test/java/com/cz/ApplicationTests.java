package com.cz;

import com.cz.item.domain.Category;
import com.cz.item.domain.Item;
import com.cz.item.service.CategoryService;
import com.cz.item.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class ApplicationTests {


   @Autowired
   private ItemService itemService;
   @Autowired
   private CategoryService categoryService;

    @Test
    public void test1() {
        Category category = categoryService.selectById(1);
        System.out.println(category.toString());
    }

    @Test
    public void test2(){
        List<Item> items = itemService.listHotItems();
        System.out.println(items);
    }

    @Test
    public void test3(){
        Item itemDetail = itemService.getItemDetail("60e054fdd0c74824bbbac46bf7d08603");
        System.out.println(itemDetail.toString());
    }

}