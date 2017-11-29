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
@TableName("sys_comment")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Comment extends BaseModel<Comment> {
    @TableField("item_id")
    private String itemId;
    private String username;
    private String comment;
    @TableField(value = "comment_date",fill = FieldFill.INSERT)
    private Date commentDate;
    private byte rating;
}
