package com.cz;

import com.cz.domain.Category;
import com.cz.domain.Item;
import com.cz.service.CategoryService;
import com.cz.service.ItemService;
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

}