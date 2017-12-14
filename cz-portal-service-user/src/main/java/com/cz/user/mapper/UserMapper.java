package com.cz.user.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cz.user.domain.User;
import com.cz.user.dto.UserInfo;

/**
 * Created by jomalone_jia on 2017/11/8.
 */
public interface UserMapper extends BaseMapper<User> {
    UserInfo getUserInfo(String username);
}
