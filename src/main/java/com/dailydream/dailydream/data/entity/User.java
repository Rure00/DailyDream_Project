package com.dailydream.dailydream.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "user")
@Entity
public class User extends BaseEntity {
    @Column(nullable = false, updatable = true)
    private String loginId;

    @Column(nullable = false, updatable = true)
    private String loginPw;

}
