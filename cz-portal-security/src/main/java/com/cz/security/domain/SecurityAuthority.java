package com.cz.security.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.common.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * Created by jomalone_jia on 2017/9/15.
 */
@TableName("front_authority")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class SecurityAuthority extends BaseModel<SecurityAuthority> {
    @TableField("user_id")
    private String userId;
    private String authority;
}
