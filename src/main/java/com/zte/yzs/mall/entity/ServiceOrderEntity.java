package com.zte.yzs.mall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "app_scl_service_order")
@Data
public class ServiceOrderEntity {

    @Id
    @Column(name = "order_service_id")
    private String orderServiceId;

    @Column(name="service_id")
    private Long serviceId;

    @Column(name = "service_content")
    private String serviceContent;

    @Column(name = "order_service_fee")
    private float orderServiceFee;


    @Column(name = "order_platform_fee")
    private String orderPlatformFee;


    @Column(name = "order_service_score")
    private String orderServiceScore;

    @Column(name = "order_service_category")
    private int orderServiceCategory;

    @Column(name = "order_service_status")
    private String orderServiceStatus;


    @Column(name = "order_service_stime")
    private Date orderServiceStime;

    @Column(name = "order_service_etime")
    private Date orderServiceEtime;
}
