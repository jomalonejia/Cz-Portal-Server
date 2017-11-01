package com.cz.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import core.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by jomalone_jia on 2017/11/1.
 */
@TableName("sys_item")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Order extends BaseModel<Order> {
}
