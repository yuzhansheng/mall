package com.zte.yzs.mall.service;

import com.zte.yzs.mall.entity.ServiceCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCategoryRepository extends JpaRepository<ServiceCategoryEntity,Integer> {
    ServiceCategoryEntity findByServiceCategory(String serviceCategory);
}
