package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.dao.IndexDao;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 15:15 2020/8/1 0001
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		Appconfig appconfig = (Appconfig) applicationContext.getBean("appconfig");
//		applicationContext.register(IndexDao.class);
//		applicationContext.refresh();
//		applicationContext.getBean(IndexDao4.class).query();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(IndexDao.class);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		//过滤方法，不能每次都去new
//		enhancer.setCallbackFilter(CALLBACK_FILTER);
		/**
		 * 对目标对象的所有方法进行拦截
		 */
		enhancer.setCallback(new TestMethodCallback());
//		enhancer.setCallbackTypes(CALLBACK_FILTER.getCallbackTypes());
		IndexDao indexDao = (IndexDao) enhancer.create();
		indexDao.query();

	}
}
