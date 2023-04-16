package com.zte.yzs.mall.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="app_scl_user_info")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "phone",nullable = false)
    private String phone;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name="gender",nullable = false)
    private String gender;
    @Column(name = "college",nullable = false)
    private String college;
    @Column(name = "major",nullable = false)
    private String major;
    @Column(name = "location")
    private String address;
}
