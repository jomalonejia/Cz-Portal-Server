package com.cz.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by jomalone_jia on 2017/12/5.
 */
@Data
@NoArgsConstructor
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    String username;
    String profile;
}
