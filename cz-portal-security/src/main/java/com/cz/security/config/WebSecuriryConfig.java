package com.cz.security.config;

import com.sun.tracing.ProbeName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by jomalone_jia on 2017/11/7.
 */
@Configuration
@EnableWebSecurity
public class WebSecuriryConfig extends WebSecurityConfigurerAdapter{


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("123456").authorities("ADMIN")
                .and()
                .withUser("user").password("123456").authorities("USER");
    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        AuthenticationManager manager = super.authenticationManagerBean();
        return manager;
    }


    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .requestMatchers().anyRequest()
                .and()
                .authorizeRequests()
                .antMatchers("/oauth*//*").permitAll();
        // @formatter:on
    }*/
}
