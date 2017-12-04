package com.cz.item.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cz.item.domain.ItemComment;
import com.cz.item.mapper.CommentMapper;
import com.cz.item.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by jomalone_jia on 2017/11/29.
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper,ItemComment> implements CommentService{

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public PageInfo<ItemComment> listComments(String itemId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(commentMapper.listCommentByItemId(itemId));
    }

    @Override
    public Integer addComment(ItemComment itemComment){
        itemComment.setCommentDate(new Date());
        return commentMapper.insert(itemComment);
    }
}
