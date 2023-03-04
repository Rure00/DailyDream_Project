package com.dailydream.dailydream.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private long number;
    private String name;
    private String loginId;
    private String loginPwd;
}
