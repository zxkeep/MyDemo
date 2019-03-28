package com.zhengxu.domain;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String proName;
    private String proNumber;
    private Integer proPrice;
    private String descrption;
    private Integer status;
}
