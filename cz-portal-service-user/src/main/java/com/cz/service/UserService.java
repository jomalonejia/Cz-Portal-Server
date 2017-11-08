package com.cz.service;

import com.baomidou.mybatisplus.service.IService;
import com.cz.domain.User;
import com.cz.dto.DtoUser;

/**
 * Created by jomalone_jia on 2017/11/8.
 */
public interface UserService extends IService<User> {
    void insertUser(DtoUser dtoUser);
}
