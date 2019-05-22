package com.zhengxu.task;

import org.springframework.stereotype.Component;

@Component
public class MyTask {

    public void taskTest(){
        System.out.println("执行定时任务了。。。。。。");
    }
}
