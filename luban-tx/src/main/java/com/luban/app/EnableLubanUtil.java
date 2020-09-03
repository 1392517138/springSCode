package com.luban.app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 13:24 2020/8/29 0029
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableLubanUtil {
	String uname() default "root";
}
