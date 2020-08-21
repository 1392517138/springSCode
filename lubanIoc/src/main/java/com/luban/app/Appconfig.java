package com.luban.app;


import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao1;
import com.luban.imports.MyImportSelector;

import org.springframework.context.annotation.*;

@ComponentScan({"com.luban"})
@Configuration
@EnableLuban(true)
//@Import(MyImportBeanDefinitionRegistrar.class)
//@Import(MyImportSelector.class)
public class Appconfig {

	@Bean
	public IndexDao1 indexDao1(){

		return new IndexDao1();
	}

	@Bean
	public IndexDao indexDao(){
		indexDao1();
		return new IndexDao();
	}
}
