package com.zhengxu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhengxu
 * @create 2019-04-30 10:26
 * @desc java Date 转 cron 表达式
 */
public class CronUtil {
/***
     *  
     * @param date 
     * @param dateFormat : yyyy-MM-dd HH:mm:ss
     * @return 
     */  
    public static String formatDateByPattern(Date date,String dateFormat){  
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);  
        String formatTimeStr = null;  
        if (date != null ) {  
            formatTimeStr = sdf.format(date);  
        }  
        return formatTimeStr;  
    }  
    
    /*** 
     *
     * @param date  : 时间点 
     * @return 
     */  
    public static String getCron(Date  date){
        String dateFormat="ss mm HH dd MM ?";
        return formatDateByPattern(date, dateFormat);  
    }

    public static void main(String[] args) {
        String cron=CronUtil.getCron(new Date());
        System.out.println(cron);
    }


}
