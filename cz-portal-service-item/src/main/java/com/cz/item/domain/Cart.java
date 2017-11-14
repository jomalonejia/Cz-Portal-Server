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
    private Integer count;
    @TableField("item_id")
    private String itemId;
    @TableField("param_id")
    private String paramId;
    @TableField("param_Value")
    private String paramValue;
    @TableField(exist = false)
    private List<CartParam> params;

    public Cart(String username, Integer count, String itemId, String paramId, String paramValue) {
        this.username = username;
        this.count = count;
        this.itemId = itemId;
        this.paramId = paramId;
        this.paramValue = paramValue;
    }
}
