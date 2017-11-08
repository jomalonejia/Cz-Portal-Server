package com.cz.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.constants.UserConstant;
import com.cz.domain.User;
import com.cz.dto.DtoUser;
import com.cz.mapper.UserMapper;
import com.cz.service.UserService;
import com.cz.utils.CastUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by jomalone_jia on 2017/11/8.
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(DtoUser dtoUser) {
        User user = CastUtil.castDtoUserToUser(dtoUser);
        user.setProfile(UserConstant.DEFAULT_PROFILE_URL);
        user.setLastUpdateDate(new Date());
        user.setEnabled(true);
        userMapper.insert(user);
    }
}
