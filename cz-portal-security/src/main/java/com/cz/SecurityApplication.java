package com.cz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Created by jomalone_jia on 2017/11/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SecurityApplication {

    private  final Logger _log = LoggerFactory.getLogger(SecurityApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SecurityApplication.class, args);
    }

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id, @RequestHeader("header-test") String header) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        _log.info("++++++++++++++++");
        _log.info(header);
        return header;
    }

    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "order id : " + id;
    }

    @GetMapping("/test")
    public String test() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "test";
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
