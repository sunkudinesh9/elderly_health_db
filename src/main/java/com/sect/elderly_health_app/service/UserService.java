package com.sect.elderly_health_app.service;

import com.sect.elderly_health_app.Dto.ApiResponse;
import com.sect.elderly_health_app.Dto.UserDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    UserDto createUser(UserDto userDTO);
    ResponseEntity<ApiResponse<String>> login(UserDto userDTO);
}
