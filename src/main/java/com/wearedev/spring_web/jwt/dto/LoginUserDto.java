package com.wearedev.spring_web.jwt.dto;

public record LoginUserDto(
        String email,
        String password
) {
}
