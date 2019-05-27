package com.zhengxu.domain;

import lombok.Data;

@Data
public class User {

    private Integer useId;
    private String useName;
    private String usePhone;
    private boolean useSex;
    private Integer useAge;
    private String useLotteryNumber;
    private Integer dataDelete;
}
