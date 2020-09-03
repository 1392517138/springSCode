package com.luban.test;

import com.luban.app.App;
import com.luban.service.OrderServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 12:56 2020/8/29 0029
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
		OrderServiceImpl service = applicationContext.getBean(OrderServiceImpl.class);
		service.query("B");

	}
}
