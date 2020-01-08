package com.zhengxu.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable{
    private static final long serialVersionUID = -6108432533271759794L;
    private Long id;
    private String proName;
    private String proNumber;
    private Integer proPrice;
    private String descrption;
    private Integer status;
}