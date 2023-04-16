package com.zte.yzs.mall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "app_scl_snack_order")
@Data
public class SnackOrderEntity {

    @Id
    private String orderSnackId;

    private int userId;

    private int snackId;

    private String name;

    private String phone;

    private Date orderTime;

    private String address;

    private String deliverTime;

    private float totalCost;

    private String note;

}

