package com.cz.user.controller;

import com.cz.user.dto.DtoUser;
import com.cz.user.dto.UserInfo;
import com.cz.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jomalone_jia on 2017/11/8.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger _log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public Object register(@RequestBody DtoUser dtoUser){
        try {
            userService.insertUser(dtoUser);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest();
    }

    @GetMapping("/getUserInfo")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> register(@RequestParam String username){
        try {
            UserInfo userInfo = userService.getUserInfo(username);
            return ResponseEntity.ok(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("get userInfo error");
    }
}
