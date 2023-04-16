package com.zte.yzs.mall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_scl_shopping_cart")
@Data
public class CartEntity {

    @Id
    private Long cartId;

    private int snackId;
    private String snackName;
    private Float snackPrice;
    private int snackNumber;
}
