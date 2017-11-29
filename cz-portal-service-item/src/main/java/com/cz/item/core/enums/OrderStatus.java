package com.cz.item.core.enums;

/**
 * Created by jomalone_jia on 2017/9/15.
 */
public enum OrderStatus {

    CANCELED(0),
    COMPLETED(1),
    AWAITING_EXCHANGE(2),
    AWAITING_SHIPPING(3),
    SHIPPING(4),
    DELIVERING(5),
    DELIVERED(6),
    AWAITING_RETURNING(7),
    RETURNING(8),
    RETURNED(9);

    private final int status;

    OrderStatus(int status){
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

}
