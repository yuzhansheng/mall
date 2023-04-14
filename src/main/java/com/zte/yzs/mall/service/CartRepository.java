package com.zte.yzs.mall.service;


import com.zte.yzs.mall.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity,Long> {
     CartEntity findBySnackId(int snackId);
}
