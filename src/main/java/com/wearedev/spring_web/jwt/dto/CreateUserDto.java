package com.wearedev.spring_web.jwt.dto;

import com.wearedev.spring_web.jwt.enums.RoleName;

public record CreateUserDto(
        String email,
        String password,
        RoleName role) {
}
