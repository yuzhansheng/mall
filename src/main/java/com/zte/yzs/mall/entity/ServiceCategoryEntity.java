package com.zte.yzs.mall.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_scl_service_category")
@Data
public class ServiceCategoryEntity {

    @Id
    @Column(name = "service_category_id")
    private int serviceCategoryId;

    @Column(name = "service_category")
    private String serviceCategory;

}
