package com.cz.item.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cz.item.domain.Cart;
import com.cz.item.domain.CartParam;

import java.util.List;

/**
 * Created by jomalone_jia on 2017/11/14.
 */
public interface CartMapper extends BaseMapper<Cart> {
    List<Cart> getCartByUsername(String username);

    int insertCartParam(CartParam cartParam);

    int deleteCart(String cartId);

    int deleteCartAll(String username);
}
