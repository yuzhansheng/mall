package com.zte.yzs.mall.service;


import com.zte.yzs.mall.entity.SnackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SnackRepository extends JpaRepository<SnackEntity,Integer> {
    List<SnackEntity> findBySnackCategory(int category);
}
