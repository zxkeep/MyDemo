package com.zhengxu.threadExecutor;

import java.util.concurrent.*;

/**
 * @zhengxu
 */
public class MyExecutorService {
    private static ExecutorService executorService=new ThreadPoolExecutor(1, 1,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>());

    private static ExecutorService synchronousQueueExecutorService=new ThreadPoolExecutor(2, 10,
            30L, TimeUnit.SECONDS,
            new SynchronousQueue<Runnable>(),new ThreadPoolExecutor.CallerRunsPolicy());
    private MyExecutorService(){

    }
    public static ExecutorService getExecutorService(){
        return executorService;
    }

    public static ExecutorService getSynchronousQueueExecutorService(){
        return synchronousQueueExecutorService;
    }

}
