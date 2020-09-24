package com.luban.app;


import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 16:00 2020/8/6 0006
 */

public class MyInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy");

		return null;
	}
}
