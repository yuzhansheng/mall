package com.zte.yzs.mall.service;


import com.zte.yzs.mall.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity findByName(String name);
    UserEntity findByPhone(String phone);
}
