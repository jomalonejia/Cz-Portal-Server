package com.cz.common.base;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Created by jomalone_jia on 2017/11/8.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseModel<T extends BaseModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    /*private Date createTime;*/

    protected Serializable pkVal() {
        // TODO Auto-generated method stub
        return id;
    }
}
