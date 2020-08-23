package com.luban.test;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 15:26 2020/8/23 0023
 */
public class TestMethodCallback implements MethodInterceptor {
	/**
	 * @param o           代理对象
	 * @param method      目标对象方法
	 * @param objects     参数
	 * @param methodProxy 代理对象方法
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("method----");
		return methodProxy.invoke(o, objects);
	}
}
