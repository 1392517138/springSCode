package com.luban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("index")
public class IndexService {
	private String name;

	@Autowired
	Luban luban;

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

}
