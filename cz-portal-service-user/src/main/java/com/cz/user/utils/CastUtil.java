package com.cz.user.utils;

import com.cz.user.domain.User;
import com.cz.user.dto.DtoUser;
import org.apache.commons.lang.StringUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CastUtil {
    public static User castDtoUserToUser(DtoUser dtoUser){
        User user = new User();
        user.setFirstName(dtoUser.getFirstName());
        user.setLastName(dtoUser.getLastName());
        user.setUsername(dtoUser.getUsername());
        user.setEmail(dtoUser.getEmail());
        if(StringUtils.isNotEmpty(dtoUser.getPassword())){
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            user.setPassword(encoder.encode(dtoUser.getPassword()));
        }
        return user;
    }
}