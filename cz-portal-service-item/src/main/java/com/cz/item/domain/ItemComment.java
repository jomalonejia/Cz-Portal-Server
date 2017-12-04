package com.cz.item.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.cz.common.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by jomalone_jia on 2017/11/29.
 */
@TableName("sys_item_comment")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class ItemComment extends BaseModel<ItemComment> {
    @TableField("item_id")
    private String itemId;
    private String username;
    private String comment;
    @TableField(value = "comment_date",fill = FieldFill.INSERT)
    private Date commentDate;
    private byte rating;
    @TableField(exist = false)
    private String profile;
}
