package com.luban.imports;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 16:16 2020/8/11 0011
 */
public class MyInvocationHandler implements InvocationHandler {
	Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是代理方法");
		return method.invoke(target, args);
	}
}
