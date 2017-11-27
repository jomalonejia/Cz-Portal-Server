package com.cz.common.base;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Created by jomalone_jia on 2017/11/24.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class SuperModel<T extends BaseModel> extends BaseModel<T> {
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;
    @TableField(value = "payment_time")
    private Date paymentTime;
    @TableField(value = "consign_time")
    private Date consignTime;
    @TableField(value = "end_time")
    private Date endTime;
    @TableField(value = "close_time")
    private Date closeTime;
}
