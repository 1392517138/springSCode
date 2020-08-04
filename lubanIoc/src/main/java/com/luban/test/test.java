package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 15:15 2020/8/1 0001
 */
public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
//		applicationContext.register(IndexDao.class);
//		applicationContext.refresh();
		System.out.println("撒旦发生");
	}
}
