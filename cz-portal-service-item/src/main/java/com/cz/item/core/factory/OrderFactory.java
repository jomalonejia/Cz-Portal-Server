package com.cz.item.core.factory;

import com.cz.item.core.enums.OrderStatus;
import com.cz.item.domain.Cart;
import com.cz.item.domain.Order;

import java.util.*;

/**
 * Created by jomalone_jia on 2017/11/21.
 */
public class OrderFactory {
    public static List<Order> createOrders(List<Cart> carts) {
        List<Order> orders = new ArrayList<Order>();
        carts.forEach(cart ->
                orders.add(new Order(
                        getOrderNumber(),
                        cart.getUsername(),
                        cart.getImage(),
                        cart.getItemId(),
                        cart.getItemName(),
                        cart.getAddress(),
                        OrderStatus.AWAITING_EXCHANGE,
                        cart.getPostFee(),
                        cart.getPrice(),
                        cart.getDiscount(),
                        cart.getCount(),
                        cart.getPostFee() + cart.getPrice() * cart.getDiscount() * cart.getCount(),
                        cart.getMessage()
                )));
        return orders;
    }

    private static String getOrderNumber() {
        //return new Date().getTime() + UUID.randomUUID().toString();
        return new Date().getTime() + "" + new Random().nextLong();
    }
}
