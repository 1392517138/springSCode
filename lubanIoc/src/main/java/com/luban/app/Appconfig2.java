package com.luban.app;

import com.luban.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 21:04 2020/9/19 0019
 */
@ComponentScan(basePackageClasses = Appconfig2.class)
public class Appconfig2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig2.class);
		AppTestService bean = applicationContext.getBean(AppTestService.class);
		IndexDao bean1 = applicationContext.getBean(IndexDao.class);
		System.out.println(bean1);
		System.out.println(bean.toString());
	}
}
