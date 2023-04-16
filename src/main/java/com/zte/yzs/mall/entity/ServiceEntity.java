package com.zte.yzs.mall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "app_scl_services")
@Data
public class ServiceEntity {

    @Id
    private Long serviceId;

    private String serviceName;

    private int serviceCategory;

    private String serviceContent;

    private float serviceFee;

    private int serviceStatus;

    private Date serviceStime;

    private Date serviceEtime;

}
