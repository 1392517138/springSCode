package com.luban.app;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Author: Aaron
 * @Description:
 * @Date: Created in 15:18 2020/9/5 0005
 */
@Component
public class LubanFactory implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition index = (GenericBeanDefinition) beanFactory.getBeanDefinition("index");
		index.getConstructorArgumentValues().addGenericArgumentValue("com.luban.service.Luban");
	}
}
