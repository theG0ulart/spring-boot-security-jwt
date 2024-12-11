package com.wearedev.spring_web.jwt.dto;

import com.wearedev.spring_web.jwt.entities.Role;

import java.util.List;

public record RecoveryUserDto(
        Long id,
        String email,
        List<Role> roles
) {
}
