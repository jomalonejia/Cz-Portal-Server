package com.cz.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import core.base.BaseModel;
import lombok.*;

import java.util.List;


/**
 * Created by jomalone_jia on 2017/9/15.
 */
@TableName("front_item")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Item extends BaseModel<Item>{
    private String title;
    private String category;
    private Integer price;
    private String mainImage;
    private List<String> showImages;
    private List<String> minusShowImages;
    private String describe;
}
