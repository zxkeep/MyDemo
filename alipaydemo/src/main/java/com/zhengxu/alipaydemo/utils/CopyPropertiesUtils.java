package com.zhengxu.alipaydemo.utils;

import java.lang.reflect.Field;

/**
 * @author zhengxu
 * @version 1.0.0
 * @create 2019-12-23 16:20
 * @desc 属性copy
 */
public class CopyPropertiesUtils {

    public static void copyProperties(Object source, Object target) {
        if(source==null || target ==null){
            throw new RuntimeException("Source and Target must not be null");
        }
        Field[] sourceFileds = source.getClass().getDeclaredFields();
        Field[] targetFileds = target.getClass().getDeclaredFields();
    }
}
