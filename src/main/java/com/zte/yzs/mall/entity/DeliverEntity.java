package com.zte.yzs.mall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_scl_deliver")
@Data
public class DeliverEntity {

    @Id
    private String deliverId;

    private String userPhone;

    private String name;

    private String gender;

    private String phone;

    private String address;
}
