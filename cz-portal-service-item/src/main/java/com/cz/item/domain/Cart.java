package com.cz.item.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.common.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by jomalone_jia on 2017/11/13.
 */
@TableName("sys_cart")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Cart extends BaseModel<Cart>{
    private Integer count;
    @TableField("item_id")
    private String itemId;
    private String userId;
    private Param param;
}
