package com.cz.item.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.item.domain.Comment;
import com.cz.item.mapper.CommentMapper;
import com.cz.item.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jomalone_jia on 2017/11/29.
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper,Comment> implements CommentService{

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public PageInfo<Comment> listComments(String itemId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(commentMapper.listCommentByItemId(itemId));
    }
}
