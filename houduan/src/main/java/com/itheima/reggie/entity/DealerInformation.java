package com.itheima.reggie.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class DealerInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String drugInformation;

    private String inboundTime;

    private String shippingWarehouse;

    private String sourceCode;

}
