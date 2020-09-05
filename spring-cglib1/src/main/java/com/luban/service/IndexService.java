package com.luban.service;


import org.springframework.stereotype.Component;

@Component("index")
public class IndexService {
	//	private String name;
//
//	@Autowired
//	Luban luban;
//
//	public String getName() {
//		return name;
//	}
//
//	@Required
//	public void setName(String name) {
//		this.name = name;
//	}
	Class clazz;

	public IndexService(Class clazz) {
		this.clazz = clazz;
	}

	public void query() {
		System.out.println(this.clazz);
	}
}
