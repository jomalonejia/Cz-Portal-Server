package com.cz.security.config.mybatis;


import com.baomidou.mybatisplus.enums.DBType;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by jomalone_jia
 */
@Configuration
@MapperScan("com.cz.security.mapper*")
public class MybatisPlusConfig {
    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType(DBType.MYSQL.getDb());
//        paginationInterceptor.setOptimizeType(Optimize.JSQLPARSER.getOptimize());

        return paginationInterceptor;
    }
}
