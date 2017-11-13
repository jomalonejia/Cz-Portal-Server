package com.cz.security.service;

import com.cz.security.SecurityApplication;
import com.cz.security.domain.SecurityAuthority;
import com.cz.security.domain.SecurityUser;
import com.cz.security.mapper.CzUserDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by jomalone_jia on 2017/11/7.
 */
public class CzUserDetailsService implements UserDetailsService {

    @Autowired
    private CzUserDetailMapper userDetailMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        SecurityUser user = userDetailMapper.loadUserByUsername(username);


        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
           return new User(user.getUsername(),user.getPassword(),mapToGrantedAuthorities(user.getAuthorities()));
        }
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<SecurityAuthority> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getAuthority()))
                .collect(Collectors.toList());
    }
}
