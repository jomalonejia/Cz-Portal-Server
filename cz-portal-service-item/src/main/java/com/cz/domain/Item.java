package com.cz.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import core.base.BaseModel;
import lombok.*;

import java.util.List;


/**
 * Created by jomalone_jia on 2017/9/15.
 */
@TableName("sys_item")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Item extends BaseModel<Item>{
    private String name;
    @TableField(value = "category_id")
    private Long categoryId;
    private Integer price;
    private String image;
    @TableField(exist = false)
    private Category category;
    @TableField(exist = false)
    private List<String> showImages;
    @TableField(exist = false)
    private List<String> minusShowImages;
    private String describe;
}
