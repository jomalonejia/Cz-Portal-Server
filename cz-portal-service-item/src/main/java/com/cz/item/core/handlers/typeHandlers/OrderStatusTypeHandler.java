package com.cz.item.core.handlers.typeHandlers;

import com.cz.item.core.enums.OrderStatus;
import org.apache.ibatis.type.EnumOrdinalTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;


/**
 * Created by jomalone_jia on 2017/9/18.
 */
@MappedJdbcTypes({JdbcType.TINYINT})
@MappedTypes({OrderStatus.class})
public class OrderStatusTypeHandler extends EnumOrdinalTypeHandler<OrderStatus>{

    public OrderStatusTypeHandler(Class<OrderStatus> type) {
        super(type);
    }
}
