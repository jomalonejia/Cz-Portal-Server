package com.cz.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by jomalone_jia on 2017/10/26.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class ParamDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    private String paramValue;
    private String inventory;


}
