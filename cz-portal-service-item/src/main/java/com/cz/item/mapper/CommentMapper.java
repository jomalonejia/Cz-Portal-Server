package com.cz.item.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cz.item.domain.Comment;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/11/29.
 */
public interface CommentMapper extends BaseMapper<Comment> {
    List<Comment> listCommentByItemId(String itemId);
}
