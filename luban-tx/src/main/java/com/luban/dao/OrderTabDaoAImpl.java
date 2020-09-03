package com.luban.dao;

import org.springframework.stereotype.Component;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 12:50 2020/8/29 0029
 */
@Component
public class OrderTabDaoAImpl implements OrderTabDao {
	@Override
	public void update(String sql) {
		System.out.println(sql);
	}
}
