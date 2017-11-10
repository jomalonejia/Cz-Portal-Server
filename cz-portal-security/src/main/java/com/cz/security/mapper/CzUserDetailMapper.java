package com.cz.security.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cz.security.domain.SecurityUser;

/**
 * Created by jomalone_jia on 2017/11/10.
 */
public interface CzUserDetailMapper extends BaseMapper<SecurityUser> {
    SecurityUser loadUserByUsername(String username);
}
