package com.luban.dao;

import com.luban.imports.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * 这个IndexDao3模拟了一个aop，将indexDao转为了一个动态对象
 */
public class IndexDao3 implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("indexDao")) {
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Dao.class}, new MyInvocationHandler(bean));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	public void query() {
		System.out.println("index3");
	}


}
