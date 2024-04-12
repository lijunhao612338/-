package com.itheima.reggie.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class VendorInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String drugInformation;

    private String inboundTime;

    private String shippingWarehouse;

    private String sourceCode;

    private String suyuanid;

    private String businessName;
}
