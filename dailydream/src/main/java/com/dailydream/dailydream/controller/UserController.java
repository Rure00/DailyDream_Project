package com.dailydream.dailydream.controller;

import com.dailydream.dailydream.data.dto.UserDto;
import com.dailydream.dailydream.data.entity.User;
import com.dailydream.dailydream.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) { this.userService = userService; }

    @GetMapping("/get-by-id")
    public ResponseEntity<UserDto> getUser( @RequestParam(value = "number") Long number) {

        UserDto responseUserData =userService.getUser(number);

        return ResponseEntity.status(HttpStatus.OK).body(responseUserData);
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(User user) {
        UserDto responseUserData =userService.createUser(user);

        return ResponseEntity.status(HttpStatus.OK).body(responseUserData);
    }
}
