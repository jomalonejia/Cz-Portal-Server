package com.cz.item.core.status;

/**
 * Created by jomalone_jia on 2017/9/15.
 */
public enum OrderStatus {

    PROCESSING(0),
    DONE(1),
    TIMEOUT(2),
    CANCEL(3);

    private final int code;

    OrderStatus(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
