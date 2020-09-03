package com.luban.service;

import com.luban.dao.OrderTabDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 12:59 2020/8/29 0029
 */
@Service
public class OrderServiceImpl implements ApplicationContextAware {
	ApplicationContext applicationContext;
	@Autowired
	OrderTabDao orderTabDao;
	/*
	可根据类型OrderTabDao进行注入
	 */
	@Autowired
	private Map<String, OrderTabDao> map;

	public void query(String username) {
		if (username.equals("A")) {
			((OrderTabDao) applicationContext.getBean("orderTabDaoAImpl")).update("aaaa");
		} else if (username.equals("B")) {
			((OrderTabDao) applicationContext.getBean("orderTabDaoBImpl")).update("bbbb");
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
