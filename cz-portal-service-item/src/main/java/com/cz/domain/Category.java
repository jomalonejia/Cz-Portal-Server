package com.cz.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import core.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by jomalone_jia on 2017/10/20.
 */
@TableName("sys_category")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Category extends BaseModel<Category> {
    @TableField
    private String name;
    @TableField(value = "parent_id")
    private Integer parentId;
}
