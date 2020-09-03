package com.luban.app;


import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao1;
import com.luban.imports.MyImportSelector;

import org.springframework.context.annotation.*;

/**
 * 对象可能不止一个默认的空参构造方法，可能还依赖了其他对象
 * 所以spring是根据并通过return new xx（xx）去new对象的
 * <p>
 * 加了@C后发现只会打印一次init，说明spring改变了这个return new xx（xx）
 */
@ComponentScan({"com.luban"})
@Configuration
//@EnableLuban(true)
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
