package com.cz.item.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.common.base.BaseModel;
import com.cz.common.base.SuperModel;
import com.cz.item.core.enums.OrderStatus;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Created by jomalone_jia on 2017/9/15.
 */
@TableName("sys_order")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Order extends SuperModel<Order> {
    @TableField("order_number")
    private String orderNumber;
    private String username;
    private String image;
    @TableField("item_id")
    private String itemId;
    @TableField("item_name")
    private String itemName;
    private String address;
    private OrderStatus status;
    @TableField("post_fee")
    private Float postFee;
    private Float price;
    private Float discount;
    private Integer count;
    @TableField("total_price")
    private Float totalPrice;
    @TableField("shipping_name")
    private String shippingName;
    @TableField("shipping_number")
    private String shippingNumber;
    @TableField("order_message")
    private String orderMessage;
    @TableField(exist = false)
    private List<OrderTrack> orderTracks;

    public Order(
            String orderNumber,
            String username,
            String image,
            String itemId,
            String itemName,
            String address,
            OrderStatus status,
            Float postFee,
            Float price,
            Float discount,
            Integer count,
            Float totalPrice,
            String orderMessage) {
        this.orderNumber = orderNumber;
        this.username = username;
        this.image = image;
        this.itemId = itemId;
        this.itemName = itemName;
        this.address = address;
        this.status = status;
        this.postFee = postFee;
        this.price = price;
        this.discount = discount;
        this.count = count;
        this.totalPrice = totalPrice;
        this.orderMessage = orderMessage;
    }
}
