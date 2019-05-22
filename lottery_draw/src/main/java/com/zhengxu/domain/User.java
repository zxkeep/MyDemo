package com.zhengxu.domain;

import lombok.Data;

@Data
public class User {

    private String token;
    private Long expires_in;
    private Long time;
    private Long uid;
    private String user_nick;
    private Long venderId;

    @Override
    public String toString() {
        return "User{" +
                "token='" + token + '\'' +
                ", expires_in=" + expires_in +
                ", time=" + time +
                ", uid=" + uid +
                ", user_nick='" + user_nick + '\'' +
                ", venderId=" + venderId +
                '}';
    }
}
