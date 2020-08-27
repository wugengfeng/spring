package com.wgf.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor是用来处理修改bean定义信息的后置处理器，这个时候bean还没有初始化，只是定好了BeanDefinition,
 * 执行顺序比BeanPostProcessor高，并且只执行一次
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		// 在获取BeanDefinition后对其修改
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userServiceImpl");

		// 改为多态
		beanDefinition.setScope("prototype");
	}
}
