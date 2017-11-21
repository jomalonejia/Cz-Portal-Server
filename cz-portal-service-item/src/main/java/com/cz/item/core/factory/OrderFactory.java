package com.cz.item.core.factory;

import com.cz.item.core.status.OrderStatus;
import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jomalone_jia on 2017/11/21.
 */
public class OrderFactory {
    public static List<Order> createOrders(List<Cart> carts){
        List<Order> orders = new ArrayList<Order>();
        carts.forEach(cart ->
                orders.add(new Order(
                        cart.getUsername(),
                        cart.getImage(),
                        cart.getItemId(),
                        cart.getItemName(),
                        cart.getAddressId(),
                        /*OrderStatus.PROCESSING*/null,
                        cart.getPostFee(),
                        cart.getPrice(),
                        cart.getDiscount(),
                        cart.getCount(),
                        cart.getPostFee()+cart.getPrice()+ cart.getDiscount()*cart.getCount(),
                        new Date(),
                        null
                )));
        return orders;
    }
}
