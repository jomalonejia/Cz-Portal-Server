package com.cz.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.domain.Category;
import com.cz.mapper.CategoryMapper;
import com.cz.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * Created by jomalone_jia
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper,Category> implements CategoryService {

}
