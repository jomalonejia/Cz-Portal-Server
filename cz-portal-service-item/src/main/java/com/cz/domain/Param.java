package com.cz.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import core.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/10/26.
 */
@TableName("sys_param")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Param extends BaseModel<Param> {
    @TableField("param_name")
    private String paramName;
    @TableField("param_describe")
    private String paramDescribe;
    @TableField(exist = false)
    private List<ParamDetail> paramDetails;
}
