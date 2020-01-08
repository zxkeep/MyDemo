package com.zhengxu.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author zhengxu
 * @create 2019-04-30 10:31
 * @desc 定时任务配置类
 */
@Component("myTaskByBean")
public class MyTaskByBean {

    private String CRON="0 47 10 30 04 ?";

    @Scheduled(cron = "0 49 10 30 04 ?")
    public void job1() {
        System.out.println("任务进行中。。。");
    }
}
