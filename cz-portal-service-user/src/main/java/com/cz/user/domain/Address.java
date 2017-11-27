package com.cz.user.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.common.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by jomalone_jia on 2017/11/20.
 */
@TableName("sys_address")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Address extends BaseModel<Address> {
    String username;
    String zip;
    String country;
    String province;
    String city;
    String address;
    @TableField("phone_number")
    String phoneNumber;
    @TableField("full_name")
    String fullName;
    @TableField("default_address")
    Boolean defaultAddress;
}
