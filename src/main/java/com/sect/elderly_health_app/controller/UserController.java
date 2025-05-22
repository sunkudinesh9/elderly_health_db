package com.sect.elderly_health_app.controller;

import com.sect.elderly_health_app.Dto.ApiResponse;
import com.sect.elderly_health_app.Dto.UserDto;
import com.sect.elderly_health_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDTO) {
        return userService.createUser(userDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<String>> login(@RequestBody UserDto userDTO) {
        return userService.login(userDTO);
    }


}
