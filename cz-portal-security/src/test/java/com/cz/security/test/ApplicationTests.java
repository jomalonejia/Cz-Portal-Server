package com.cz.security.test;

import com.cz.security.domain.SecurityUser;
import com.cz.security.mapper.CzUserDetailMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = com.cz.security.SecurityApplication.class)
public class ApplicationTests {

    @Autowired
    private CzUserDetailMapper czUserDetailMapper;

    @Test
    public void test1(){
        SecurityUser user = czUserDetailMapper.loadUserByUsername("user");
        System.out.println(user.toString());
    }
}