package com.cz.core.typeHandler;

import com.cz.core.status.OrderStatus;
import org.apache.ibatis.type.*;



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
