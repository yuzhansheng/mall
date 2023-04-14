package com.zte.yzs.mall.service;


import com.zte.yzs.mall.entity.ServiceOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrderEntity,String> {

}
