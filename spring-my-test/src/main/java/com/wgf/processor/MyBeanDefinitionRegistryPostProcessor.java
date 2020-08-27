package com.wgf.processor;

import com.wgf.service.OrderServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor的后代接口
 * 注册后置处理器，可以通过实现这个接口将Bean注册到BeanDefinitionRegistry中
 * BeanDefinitionRegistryPostProcessor 执行优先级优先于 BeanFactoryPostProcessor
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// 获取Bean定义
		RootBeanDefinition definition = new RootBeanDefinition(OrderServiceImpl.class);

		registry.registerBeanDefinition("orderServiceImpl", definition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
