package com.cz.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.cz.user.domain.User;
import com.cz.user.dto.DtoUser;
import com.cz.user.dto.UserInfo;

/**
 * Created by jomalone_jia on 2017/11/8.
 */
public interface UserService extends IService<User> {
    void insertUser(DtoUser dtoUser);
    UserInfo getUserInfo(String username);
}
