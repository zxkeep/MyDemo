package com.zhengxu.anno;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author zhengxu
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

	String value() default "";
}
