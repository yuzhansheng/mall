package com.zte.yzs.mall.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "app_scl_snacks")
@Data
public class SnackEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int snackId;

    private String snackName;
    private Float snackPrice;
    private int snackCategory;
    private String snackInfo;
    private int snackBalance;

    private byte[] snackPic;

    @Transient
    private String picString;

}
