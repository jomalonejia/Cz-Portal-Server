package com.cz.item.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.common.base.BaseModel;
import com.cz.item.core.status.OrderStatus;
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
public class Order extends BaseModel<Order> {
    private String username;
    private String image;
    @TableField("item_id")
    private String itemId;
    @TableField("item_name")
    private String itemName;
    @TableField(exist = false)
    private String address;
    @TableField("address_id")
    private String addressId;
    private OrderStatus status;
    @TableField("post_fee")
    private Float postFee;
    private Float price;
    private Float discount;
    private Float count;
    @TableField("total_price")
    private Float totalPrice;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;
    @TableField("payment_time")
    private Date paymentTime;
    @TableField("consign_time")
    private Date consignTime;
    @TableField("end_time")
    private Date endTime;
    @TableField("close_time")
    private Date closeTime;
    @TableField("shipping_name")
    private String shippingName;
    @TableField("shipping_number")
    private String shippingNumber;
    @TableField("order_message")
    private String orderMessage;

    public Order(
            String username,
            String image,
            String itemId,
            String itemName,
            String addressId,
            OrderStatus status,
            Float postFee,
            Float price,
            Float discount,
            Float count,
            Float totalPrice,
            Date createTime,
            String orderMessage) {
        this.username = username;
        this.image = image;
        this.itemId = itemId;
        this.itemName = itemName;
        this.addressId = addressId;
        this.status = status;
        this.postFee = postFee;
        this.price = price;
        this.discount = discount;
        this.count = count;
        this.totalPrice = totalPrice;
        this.createTime = createTime;
        this.orderMessage = orderMessage;
    }
}
