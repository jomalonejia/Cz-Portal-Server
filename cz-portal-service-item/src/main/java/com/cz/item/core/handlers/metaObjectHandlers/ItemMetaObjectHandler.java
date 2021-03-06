package com.cz.item.core.handlers.metaObjectHandlers;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * Created by jomalone_jia on 2017/11/27.
 */
public class ItemMetaObjectHandler extends MetaObjectHandler{
    @Override
    public void insertFill(MetaObject metaObject) {

        this.setFieldValByName("trackTime", new Date(), metaObject);
        this.setFieldValByName("commentDate",new Date(), metaObject);
    }

    @Override
    public boolean openUpdateFill() {
        return false;
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 关闭更新填充、这里不执行
    }
}
