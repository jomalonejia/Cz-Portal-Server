package com.cz.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.common.constants.UserConstant;
import com.cz.user.domain.User;
import com.cz.user.dto.DtoUser;
import com.cz.user.dto.UserInfo;
import com.cz.user.mapper.UserMapper;
import com.cz.user.service.UserService;
import com.cz.user.utils.CastUtil;
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

    @Override
    public UserInfo getUserInfo(String username) {
        return userMapper.getUserInfo(username);
    }
}
