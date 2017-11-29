package com.cz.item.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.cz.common.base.BaseModel;
import com.cz.item.core.enums.OrderStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jomalone_jia on 2017/11/27.
 */
@TableName("sys_order_track")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class OrderTrack extends BaseModel<OrderTrack> {

    private static final long serialVersionUID = -5525945043167886294L;

    @TableField("order_id")
    private String orderId;
    private OrderStatus status;
    @TableField("track_information")
    private String trackInformation;
    @TableField(value = "track_time",fill = FieldFill.INSERT_UPDATE)
    private Date trackTime;

    public OrderTrack(String orderId, String trackInformation, OrderStatus status) {
        this.orderId = orderId;
        this.trackInformation = trackInformation;
        this.status = status;
    }

    public OrderTrack(String orderId, OrderStatus status, String trackInformation, Date trackTime) {
        this.orderId = orderId;
        this.status = status;
        this.trackInformation = trackInformation;
        this.trackTime = trackTime;
    }
}
