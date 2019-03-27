package com.zhengxu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Controller
public class JeidsTest {

    @Autowired
    private JedisPool jedisPool;

    public static void main(String[] args) {




    }

    /**
     * 存入redis 的key 值
     * @param key
     */
    public String getValue(String key){
        Jedis jedis = jedisPool.getResource();
        String s = jedis.get(key);
        return s;
    }
}
