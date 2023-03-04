package com.dailydream.dailydream.data.dao.Implement;

import com.dailydream.dailydream.data.dao.UserDao;
import com.dailydream.dailydream.data.entity.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;


@Component
public class UserDaoImplement implements UserDao {

    private final EntityManager entityManager;

    public UserDaoImplement(EntityManager entityManager) { this.entityManager = entityManager; }

    @Override
    public User searchUserById(Long number) {
        User user = null;

        try{
            user = entityManager.find(User.class, number);
        } catch (Exception e) {
            System.err.println("searchUserById gets null");
        }

        return user;
    }

    @Override
    public User createUser() {

        return null;
    }

}
