package com.sect.elderly_health_app.service.impl;

import com.sect.elderly_health_app.Dto.ApiResponse;
import com.sect.elderly_health_app.Dto.UserDto;
import com.sect.elderly_health_app.mapper.UserMapper;
import com.sect.elderly_health_app.model.LoginUser;
import com.sect.elderly_health_app.repository.UserRepository;
import com.sect.elderly_health_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    public UserDto createUser(UserDto userDTO) {
        LoginUser loginUser = userMapper.toEntity(userDTO);
        return userMapper.toDto(userRepository.save(loginUser));
    }

    @Override
    public ResponseEntity<ApiResponse<String>> login(UserDto userDTO) {
        LoginUser byUsername = userRepository.findByUsername(userDTO.getUsername());
        if (!userDTO.getPassword().equals(byUsername.getPassword())) {
            return new ResponseEntity<>(
                    new ApiResponse<>("", LocalDateTime.now(), "In-Valid credentials"),
                    HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(
                new ApiResponse<>("", LocalDateTime.now(), "user Validated"),
                HttpStatus.OK);
    }
}
