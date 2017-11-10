package com.cz.user.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.common.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by jomalone_jia on 2017/11/8.
 */
@TableName("front_user")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class User extends BaseModel<User> {
    private String username;
    private String password;
    @TableField("first_name")
    private String firstName;
    @TableField("last_name")
    private String lastName;
    private Boolean enabled;
    private String profile;
    private String email;
    @TableField("last_update_date")
    private Date lastUpdateDate;
}
