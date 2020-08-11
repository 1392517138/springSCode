package com.luban.test;

import com.luban.app.MyInvocationHandler;
import com.luban.dao.Dao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 16:20 2020/8/6 0006
 */
//@Component
public class MyFactoryBean implements FactoryBean, InvocationHandler {
	Class clazz;

	/**
	 * 之前是空参构造方法，现在spring无法调用默认的了
	 *
	 * @param clazz
	 */
	public MyFactoryBean(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Class[] clazzs = new Class[]{clazz};
		Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(), clazzs, this);
		return proxy;
	}

	@Override
	public Class<?> getObjectType() {
		//先写死
		return clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		System.out.println("proxy2");
//		Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName(), String.class);
//		Select select = method1.getDeclaredAnnotation(Select.class);
//		System.out.println(select.value()[0]);
		return null;
	}
}
