package com.cz.security.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.common.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/11/10.
 */
@TableName("front_user")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class SecurityUser extends BaseModel<SecurityUser> {
    private String username;
    private String password;
    @TableField(exist = false)
    private List<SecurityAuthority> authorities;
}
