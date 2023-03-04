package com.dailydream.dailydream.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "user")
@Entity

public class User extends BaseEntity {
    @Column(nullable = false, updatable = true)
    @Getter
    @Setter
    private String loginId;

    @Column(nullable = false, updatable = true)
    @Getter
    @Setter
    private String loginPwd;
}
