package com.cz.item.service;

import com.baomidou.mybatisplus.service.IService;
import com.cz.item.domain.ItemComment;
import com.github.pagehelper.PageInfo;

/**
 * Created by jomalone_jia on 2017/11/29.
 */
public interface CommentService extends IService<ItemComment> {
    PageInfo<ItemComment> listComments(String itemId, int pageNum, int pageSize);

    Integer addComment(ItemComment itemComment);
}
