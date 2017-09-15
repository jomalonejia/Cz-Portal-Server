package com.cz.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.core.OrderStatus;
import core.base.BaseEntity;
import lombok.*;

import java.util.Date;

/**
 * Created by jomalone_jia on 2017/9/15.
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@TableName("front_order")
public class Order extends BaseEntity<Order>{
    private String orderId;
    private String userId;
    private OrderStatus status;
    private Integer postFee;
    private Integer price;
    private Integer totalPrice;
    private Date createTime;
    private Date updateTime;
    private Date paymentTime;
    private Date consignTime;
    private Date endTime;
    private Date closeTime;
    private String shippingName;
    private String shippingNumber;
    private String orderMessage;
}
