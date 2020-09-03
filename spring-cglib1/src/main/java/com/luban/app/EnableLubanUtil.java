package com.luban.app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 9:51 2020/9/3 0003
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableLubanUtil {
	String uname() default "root";
}
