package com.cz.item.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cz.item.domain.ItemComment;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/11/29.
 */
public interface CommentMapper extends BaseMapper<ItemComment> {
    List<ItemComment> listCommentByItemId(String itemId);
}
