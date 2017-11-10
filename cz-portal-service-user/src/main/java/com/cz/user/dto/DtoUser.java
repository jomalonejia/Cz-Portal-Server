package com.cz.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by jomalone_jia on 2017/11/8.
 */
@Data
@NoArgsConstructor
public class DtoUser implements Serializable{
    private static final long serialVersionUID = 6751186455213485079L;

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
