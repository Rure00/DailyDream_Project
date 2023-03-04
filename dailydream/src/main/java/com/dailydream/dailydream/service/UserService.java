package com.dailydream.dailydream.service;

import com.dailydream.dailydream.data.dto.UserDto;
import com.dailydream.dailydream.data.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDto getUser(Long number);
    UserDto createUser(User user);
}
