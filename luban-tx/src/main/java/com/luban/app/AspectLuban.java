package com.luban.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 12:52 2020/8/29 0029
 */
@Component
@Aspect
public class AspectLuban {
	@Pointcut("execution(* com.luban.dao..*.*(..))")
	public void pointCut() {

	}

	@Before("pointCut()")
	public void before() {
		System.out.println("proxy before");
	}
}
