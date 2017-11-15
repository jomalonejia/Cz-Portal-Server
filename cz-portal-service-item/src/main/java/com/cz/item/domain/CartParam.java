package com.cz.item.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by jomalone_jia on 2017/11/14.
 */

public class CartParam implements Serializable{
    private static final long serialVersionUID = 1L;
    private String cartId;
    private String paramId;
    private String paramValue;
    private String paramDescribe;

    public String getParamDescribe() {
        return paramDescribe;
    }

    public void setParamDescribe(String paramDescribe) {
        this.paramDescribe = paramDescribe;
    }

    public CartParam(){}

    public CartParam(String cartId, String paramId, String paramValue) {
        this.cartId = cartId;
        this.paramId = paramId;
        this.paramValue = paramValue;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Override
    public String toString() {
        return "CartParam{" +
                "paramId='" + paramId + '\'' +
                ", paramValue='" + paramValue + '\'' +
                '}';
    }
}
