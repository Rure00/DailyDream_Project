package com.dailydream.dailydream.service.implement;

import com.dailydream.dailydream.data.dao.UserDao;
import com.dailydream.dailydream.data.dto.UserDto;
import com.dailydream.dailydream.data.entity.User;
import com.dailydream.dailydream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImplement implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImplement(UserDao userDao) { this.userDao = userDao; }

    @Override
    public UserDto getUser(Long number) {
        User userData = userDao.searchUserById(number);

        UserDto userDto = new UserDto(
                userData.getNumber(),
                userData.getName(),
                userData.getLoginId(),
                userData.getLoginPwd()
        );


        return userDto;
    }

    @Override
    public UserDto createUser(User user) {



        return null;
    }
}
