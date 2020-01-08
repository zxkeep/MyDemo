package com.zhengxu.aspect;

import com.zhengxu.domain.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;
import java.util.Arrays;


/**
 * 系统日志，切面处理类
 * 
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月14日 下午8:00:45
 */
@Aspect
@Component
public class SysLogAspect {
	

	@Pointcut("@annotation(com.zhengxu.anno.SysLog)")
	public void logPointCut() { 
		
	}

   /* @Before("logPointCut()")
    public void before(JoinPoint point) throws Throwable {
        Object[] args = point.getArgs();
        System.out.println(point.getSignature().getName()+"除法开始。。。参数列表为{"+ Arrays.asList(args)+"}");
    }*/


    @Around("logPointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		long beginTime = System.currentTimeMillis();
		//执行方法
		Object result = point.proceed();
        User u = (User)result;
        System.out.println("aop执行方法："+u);
		//执行时长(毫秒)
		long time = System.currentTimeMillis() - beginTime;
		//保存日志
		saveSysLog(point, time);
		return result;
	}

   /* @After("logPointCut()")
    public void after(JoinPoint point) throws Throwable {
        System.out.println(point.getSignature().getName()+"after");
    }*/

	private void saveSysLog(ProceedingJoinPoint joinPoint, long time) {
        System.out.println("保存成功========================================");
    }
	
}
