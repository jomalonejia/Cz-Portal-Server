package com.cz.item.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by jomalone_jia on 2017/12/4.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class ItemOrderInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    private String orderNumber;
    private String username;
    private String image;
    private String itemId;
    private String itemName;
    private Float totalPrice;
}
