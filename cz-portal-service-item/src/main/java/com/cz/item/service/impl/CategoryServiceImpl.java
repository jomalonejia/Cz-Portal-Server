package com.cz.item.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.item.domain.Category;
import com.cz.item.mapper.CategoryMapper;
import com.cz.item.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * Created by jomalone_jia
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper,Category> implements CategoryService {

}
