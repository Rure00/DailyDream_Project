package com.dailydream.dailydream.data.dao;

import com.dailydream.dailydream.data.entity.User;

public interface UserDao {
    User searchUserById(Long number);

    User createUser();
}
