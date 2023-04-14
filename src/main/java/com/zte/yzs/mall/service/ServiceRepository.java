package com.zte.yzs.mall.service;

import com.zte.yzs.mall.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ServiceRepository extends JpaRepository<ServiceEntity,Long> {
    public List<ServiceEntity> findByServiceName(String serviceName);
}
