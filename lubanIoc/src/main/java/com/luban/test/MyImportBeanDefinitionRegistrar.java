package com.luban.test;

import com.luban.app.MyInvocationHandler;
import com.luban.dao.Dao;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 15:53 2020/8/6 0006
 */

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		/**
		 * 1.得到bd
		 */
		//扫描所有的接口(实际上是扫描出来)
		/**
		 * 注意dao.getClass跟Dao.class不一样，dao 是一个代理。spring不能将他注入容器
		 Dao dao = (Dao)Proxy.newProxyInstance(MyImportBeanDefinitionRegistrar.class.getClassLoader(),new Class[]{Dao.class},new MyInvocationHandler())
		 BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(dao.getClass());
		 //bd有很多分类，我们这里用GenericBeanDefinition去接受
		 GenericBeanDefinition beanDefinition = (GenericBeanDefinition)builder.getBeanDefinition();
		 registry.registerBeanDefinition("dao",beanDefinition);
		 */
//		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(Dao.class);
//		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
//		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("dao");
//		beanDefinition.setBeanClass(MyFactoryBean.class);
//		registry.registerBeanDefinition("dao", beanDefinition);
	}
}
