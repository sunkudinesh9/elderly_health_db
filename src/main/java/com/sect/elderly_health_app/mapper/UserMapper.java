package com.sect.elderly_health_app.mapper;

import com.sect.elderly_health_app.Dto.UserDto;
import com.sect.elderly_health_app.model.LoginUser;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(LoginUser loginUser) {
        return UserDto.builder()
                .username(loginUser.getUsername())
                .password(loginUser.getPassword())
                .role(loginUser.getRole())
                .build();
    }

    public LoginUser toEntity(UserDto dto) {
        LoginUser loginUser = new LoginUser();
        loginUser.setUsername(dto.getUsername());
        loginUser.setPassword(dto.getPassword());
        loginUser.setRole(dto.getRole());
        return loginUser;
    }
}
