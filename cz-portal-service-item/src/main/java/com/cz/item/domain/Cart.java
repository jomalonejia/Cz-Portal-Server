package com.cz.item.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.common.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/11/13.
 */
@TableName("sys_cart")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Cart extends BaseModel<Cart>{
    private String username;
    private Float count;
    @TableField("item_id")
    private String itemId;
    @TableField(exist = false)
    private String paramDescribe;
    @TableField(exist = false)
    private String paramValue;
    @TableField(exist = false)
    private List<CartParam> params;
    @TableField(exist = false)
    private String image;
    @TableField(exist = false)
    private Float price;
    @TableField(exist = false)
    private Float postFee;
    @TableField(exist = false)
    private Float discount;
    @TableField(exist = false)
    private String itemName;
    @TableField(exist = false)
    private String itemDescribe;
    @TableField(exist = false)
    private String addressId;
}
