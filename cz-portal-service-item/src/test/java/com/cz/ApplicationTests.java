package com.cz;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.cz.item.domain.Cart;
import com.cz.item.domain.Category;
import com.cz.item.domain.Item;
import com.cz.item.domain.Order;
import com.cz.item.mapper.CartMapper;
import com.cz.item.mapper.OrderMapper;
import com.cz.item.service.CategoryService;
import com.cz.item.service.ItemService;
import com.cz.item.service.OrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = com.cz.item.ItemApplication.class)
public class ApplicationTests {

   @Autowired
   private CartMapper cartMapper;
   @Autowired
   private ItemService itemService;
   @Autowired
   private CategoryService categoryService;
   @Autowired
   private OrderService orderService;
   @Autowired
   private OrderMapper orderMapper;

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

    @Test
    public void test4(){
        List<Cart> user = cartMapper.getCartByUsername("user");
        System.out.println(user.toString());
    }

    @Test
    public void test5(){
        cartMapper.deleteCart("be7b6ada57124cc28abad84160f91bae");
    }

    @Test
    public void test6(){
        Item item = itemService.getItemDetail("ffc1044c2f2a4f29a37a57eac72817d7");
        System.out.println(item.getShownImages());
    }

    @Test
    public void test7(){
        cartMapper.deleteCartAll("user");
    }

    @Test
    public void test8(){
        PageHelper.startPage(1,5);
        List<Order> orders = orderMapper.listOrders("user");
        System.out.println(orders);
        orders.forEach(u -> System.out.println(u.toString()));
        System.out.println(new PageInfo<Order>(orders));
    }

    @Test
    public void test9(){
        Page<Order> user = orderService.listOrders("user", 1, 5);
        user.forEach(u -> System.out.println(u.toString()));
    }
}